package finitestatemachine.states.cutstates;

import javax.inject.Inject;

import finitestatemachine.ChangeStateCaller;
import finitestatemachine.CutState;
import finitestatemachine.base.BaseCutState;
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
