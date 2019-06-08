package finitestatemachine.basestates;


import finitestatemachine.ChangeStateCaller;
import example.questioneers.FiniteStateMachineQuestioner;
import io.reactivex.Completable;

public abstract class BaseStartState<T> extends BaseTransitionState<T> {

    public BaseStartState(T transitionsActions,
                          ChangeStateCaller changeStateCaller,
                          Completable transitionHandler) {
        super(transitionsActions, changeStateCaller, transitionHandler);
    }


    public Completable startFiniteStateMachine() {
        return handleStateToNext();
    }

}
