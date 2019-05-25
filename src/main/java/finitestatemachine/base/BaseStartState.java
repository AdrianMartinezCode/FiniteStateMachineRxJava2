package finitestatemachine.base;


import finitestatemachine.ChangeStateCaller;
import finitestatemachine.FiniteStateMachineQuestioner;
import io.reactivex.Completable;

public abstract class BaseStartState extends BaseTransitionState {

    public BaseStartState(FiniteStateMachineQuestioner transitionsActions, ChangeStateCaller changeStateCaller, Completable transitionHandler) {
        super(transitionsActions, changeStateCaller, transitionHandler);
    }


    public Completable startFiniteStateMachine() {
        return handleStateToNext();
    }

}
