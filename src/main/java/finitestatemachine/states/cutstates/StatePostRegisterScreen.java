package finitestatemachine.states.cutstates;

import com.example.zonetacts.zonetacts.ui.login.finitestatemachine.ChangeStateCaller;
import com.example.zonetacts.zonetacts.ui.login.finitestatemachine.CutState;
import com.example.zonetacts.zonetacts.ui.login.finitestatemachine.base.BaseCutState;

import javax.inject.Inject;

import io.reactivex.Completable;

public class StatePostRegisterScreen extends BaseCutState {

    // Callables
    private Completable postRegisterScreenAction;

    @Inject
    public StatePostRegisterScreen(ChangeStateCaller changeStateCaller,
                                   Completable postRegisterScreenAction) {
        super(changeStateCaller);
        this.postRegisterScreenAction = postRegisterScreenAction;
    }

    @Override
    public CutState getCutState() {
        return CutState.POSTREGISTERSCREEN;
    }

    @Override
    public Completable getScreenAction() {
        return postRegisterScreenAction;
    }


}
