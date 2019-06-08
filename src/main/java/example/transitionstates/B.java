package example.transitionstates;

import example.cutstates.X;
import example.questioneers.FiniteStateMachineQuestioner;
import example.responses.TwoResponse;
import finitestatemachine.ChangeStateCaller;
import finitestatemachine.basestates.BaseState;
import finitestatemachine.basestates.BaseTransitionState;
import io.reactivex.Completable;
import io.reactivex.Single;

import javax.inject.Inject;
import javax.inject.Named;

public class B extends BaseTransitionState<FiniteStateMachineQuestioner> {

    private D dState;
    private X xState;

    @Inject
    public B(FiniteStateMachineQuestioner questioner,
             ChangeStateCaller changeStateCaller,
             @Named("B") Completable transitionHandler,
             D dState,
             X xState) {
        super(questioner, changeStateCaller, transitionHandler);
        this.dState = dState;
        this.xState = xState;
    }

    @Override
    protected Single<BaseState> handleState() {
        return getQuestioner().b1b2().flatMap(r -> {
            if (r == TwoResponse.A) return Single.just(dState);
            return Single.just(xState);
        });
    }
}
