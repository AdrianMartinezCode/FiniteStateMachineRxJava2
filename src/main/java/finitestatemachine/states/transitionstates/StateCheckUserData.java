package finitestatemachine.states.transitionstates;

import javax.inject.Inject;

import finitestatemachine.ChangeStateCaller;
import finitestatemachine.FiniteStateMachineQuestioner;
import finitestatemachine.base.BaseTransitionState;
import finitestatemachine.states.cutstates.StateListRoomScreen;
import finitestatemachine.states.cutstates.StateLoginScreen;
import finitestatemachine.states.cutstates.StatePostRegisterScreen;
import io.reactivex.Completable;

public class StateCheckUserData extends BaseTransitionState {

    // Transitions
    private StatePostRegisterScreen requiredRegisterTrue;
    private StateListRoomScreen requiredRegisterFalse;
    private StateLoginScreen invalidDataUser;

    @Inject
    public StateCheckUserData(FiniteStateMachineQuestioner transitionsActions,
                              ChangeStateCaller changeStateCaller,
                              StatePostRegisterScreen requiredRegisterTrue,
                              StateListRoomScreen requiredRegisterFalse,
                              StateLoginScreen invalidDataUser,
                              Completable transitionHandler) {
        super(transitionsActions, changeStateCaller, transitionHandler);
        this.invalidDataUser = invalidDataUser;
        this.requiredRegisterTrue = requiredRegisterTrue;
        this.requiredRegisterFalse = requiredRegisterFalse;
    }

    @Override
    protected Completable handleState() {
        return getTransitionsActions().dataUserStoredIsValid().flatMapCompletable(validDataUserStored -> {
            if (validDataUserStored) {
                return getTransitionsActions().requiredRegister().flatMapCompletable(requiredRegister -> {
                    if (requiredRegister) {
                        return getChangeStateCaller().onChangeState(requiredRegisterTrue);
                    } else {
                        return getChangeStateCaller().onChangeState(requiredRegisterFalse);
                    }
                });
            } else {
                return getChangeStateCaller().onChangeState(invalidDataUser);
            }
        });
    }
}
