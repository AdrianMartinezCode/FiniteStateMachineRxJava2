package finitestatemachine.deprecated.states.transitionstates;

import finitestatemachine.ChangeStateCaller;
import finitestatemachine.FiniteStateMachineQuestioner;
import finitestatemachine.base.BaseTransitionState;
import finitestatemachine.deprecated.states.cutstates.StateListRoomScreen;
import io.reactivex.Completable;

public class StateCheckValidToken extends BaseTransitionState {

    // Transitions
    private StateCheckUserData noValidToken;
    private StateListRoomScreen validToken;

//    @Inject
    public StateCheckValidToken(FiniteStateMachineQuestioner transitionsActions,
                                ChangeStateCaller changeStateCaller,
                                StateCheckUserData noValidToken,
                                StateListRoomScreen validToken,
                                Completable transitionHandler) {
        super(transitionsActions, changeStateCaller, transitionHandler);
        this.noValidToken = noValidToken;
        this.validToken = validToken;
    }

    @Override
    protected Completable handleState() {
        return getTransitionsActions().tokenStoredIsValid().flatMapCompletable(tokenStoredValid -> {
           if (tokenStoredValid) {
               return getChangeStateCaller().onChangeState(validToken);
           } else {
               return getChangeStateCaller().onChangeState(noValidToken);
           }
        });
    }
}
