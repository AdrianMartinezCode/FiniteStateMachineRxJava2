package finitestatemachine.states.cutstates;


import javax.inject.Inject;

import finitestatemachine.ChangeStateCaller;
import finitestatemachine.CutState;
import finitestatemachine.base.BaseCutState;
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
