package finitestatemachine.states.transitionstates;

import com.example.zonetacts.zonetacts.ui.login.finitestatemachine.FiniteStateMachineQuestioner;
import com.example.zonetacts.zonetacts.ui.login.finitestatemachine.ChangeStateCaller;
import com.example.zonetacts.zonetacts.ui.login.finitestatemachine.base.BaseStartState;
import com.example.zonetacts.zonetacts.ui.login.finitestatemachine.states.cutstates.StateLoginScreen;

import javax.inject.Inject;

import io.reactivex.Completable;

public class StateStart extends BaseStartState {

    // Transitions
    private StateCheckValidToken hasToken;
    private StateCheckUserData noHasToken;
    private StateLoginScreen noHasTokenAndNoHasDataUser;


    @Inject
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
