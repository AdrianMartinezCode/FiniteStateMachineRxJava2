package finitestatemachine.states.cutstates;

import com.example.zonetacts.zonetacts.ui.login.finitestatemachine.ChangeStateCaller;
import com.example.zonetacts.zonetacts.ui.login.finitestatemachine.CutState;
import com.example.zonetacts.zonetacts.ui.login.finitestatemachine.base.BaseCutState;

import javax.inject.Inject;

import io.reactivex.Completable;

public class StateLoginScreen extends BaseCutState {


    // Callers
    private Completable loginScreenAction;


    @Inject
    public StateLoginScreen(ChangeStateCaller changeStateCaller,
                            Completable loginScreenAction) {
        super(changeStateCaller);
        this.loginScreenAction = loginScreenAction;
    }

    @Override
    public CutState getCutState() {
        return CutState.LOGINSCREEN;
    }

    @Override
    public Completable getScreenAction() {
        return loginScreenAction;
    }

}
