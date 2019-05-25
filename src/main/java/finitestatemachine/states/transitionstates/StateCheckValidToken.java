package finitestatemachine.states.transitionstates;

import com.example.zonetacts.zonetacts.ui.login.finitestatemachine.FiniteStateMachineQuestioner;
import com.example.zonetacts.zonetacts.ui.login.finitestatemachine.ChangeStateCaller;
import com.example.zonetacts.zonetacts.ui.login.finitestatemachine.base.BaseTransitionState;
import com.example.zonetacts.zonetacts.ui.login.finitestatemachine.states.cutstates.StateListRoomScreen;

import javax.inject.Inject;

import io.reactivex.Completable;

public class StateCheckValidToken extends BaseTransitionState {

    // Transitions
    private StateCheckUserData noValidToken;
    private StateListRoomScreen validToken;

    @Inject
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
