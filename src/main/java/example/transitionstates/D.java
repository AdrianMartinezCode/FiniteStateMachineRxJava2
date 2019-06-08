package example.transitionstates;

import example.questioneers.FiniteStateMachineQuestioner;
import finitestatemachine.ChangeStateCaller;
import finitestatemachine.basestates.BaseTransitionState;
import io.reactivex.Completable;

public class D extends BaseTransitionState {
    public D(FiniteStateMachineQuestioner questioner,
             ChangeStateCaller changeStateCaller,
             Completable transitionHandler) {
        super(questioner, changeStateCaller, transitionHandler);
    }

    @Override
    protected Completable handleState() {
        return null;
    }
}
