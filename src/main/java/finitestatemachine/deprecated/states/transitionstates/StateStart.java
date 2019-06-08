package finitestatemachine.deprecated.states.transitionstates;

import finitestatemachine.ChangeStateCaller;
import finitestatemachine.FiniteStateMachineQuestioner;
import finitestatemachine.base.BaseStartState;
import finitestatemachine.deprecated.states.cutstates.StateLoginScreen;
import io.reactivex.Completable;

public class StateStart extends BaseStartState {

    // Transitions
    private StateCheckValidToken hasToken;
    private StateCheckUserData noHasToken;
    private StateLoginScreen noHasTokenAndNoHasDataUser;


//    @Inject
    public StateStart(FiniteStateMachineQuestioner transitionsActions,
                      ChangeStateCaller changeStateCaller,
                      StateCheckValidToken hasToken,
                      StateCheckUserData noHasToken,
                      StateLoginScreen noHasTokenAndNoHasDataUser,
                      Completable transitionHandler) {
        super(transitionsActions, changeStateCaller, transitionHandler);
        this.hasToken = hasToken;
        this.noHasToken = noHasToken;
        this.noHasTokenAndNoHasDataUser = noHasTokenAndNoHasDataUser;
    }


    @Override
    protected Completable handleState() {
        return getTransitionsActions().hasToken().flatMapCompletable(hasTokenStored -> {
            if (hasTokenStored) {
                return getChangeStateCaller().onChangeState(hasToken);
            } else {
                return getTransitionsActions().hasDataUser().flatMapCompletable(hasDataUser -> {
                    if (hasDataUser) {
                        return getChangeStateCaller().onChangeState(noHasToken);
                    } else {
                        return getChangeStateCaller().onChangeState(noHasTokenAndNoHasDataUser);
                    }
                });
            }
        });
    }
}
