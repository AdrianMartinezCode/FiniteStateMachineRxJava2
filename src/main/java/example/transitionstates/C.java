package example.transitionstates;

import example.questioneers.FiniteStateMachineQuestioner;
import finitestatemachine.ChangeStateCaller;
import finitestatemachine.basestates.BaseTransitionState;
import io.reactivex.Completable;

public class C extends BaseTransitionState {
    public C(FiniteStateMachineQuestioner questioner,
             ChangeStateCaller changeStateCaller,
             Completable transitionHandler) {
        super(questioner, changeStateCaller, transitionHandler);
    }

    @Override
    protected Completable handleState() {
        return null;
    }
}
