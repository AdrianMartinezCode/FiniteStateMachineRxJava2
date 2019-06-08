package example.transitionstates;

import example.questioneers.FiniteStateMachineQuestioner;
import finitestatemachine.ChangeStateCaller;
import finitestatemachine.basestates.BaseStartState;
import io.reactivex.Completable;

public class A extends BaseStartState {


    public A(FiniteStateMachineQuestioner transitionsActions,
             ChangeStateCaller changeStateCaller,
             Completable transitionHandler) {
        super(transitionsActions, changeStateCaller, transitionHandler);
    }

    @Override
    protected Completable handleState() {
        return null;
    }
}
