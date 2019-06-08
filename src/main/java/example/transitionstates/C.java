package example.transitionstates;

import example.questioneers.FiniteStateMachineQuestioner;
import example.responses.TwoResponse;
import finitestatemachine.ChangeStateCaller;
import finitestatemachine.basestates.BaseState;
import finitestatemachine.basestates.BaseTransitionState;
import io.reactivex.Completable;
import io.reactivex.Single;

import javax.inject.Inject;
import javax.inject.Named;

public class C extends BaseTransitionState<FiniteStateMachineQuestioner> {

    private F fState;
    private D dState;

    @Inject
    public C(FiniteStateMachineQuestioner questioner,
             ChangeStateCaller changeStateCaller,
             @Named("C") Completable transitionHandler,
             F fState,
             D dState) {
        super(questioner, changeStateCaller, transitionHandler);
        this.fState = fState;
        this.dState = dState;
    }

    @Override
    protected Single<BaseState> handleState() {
        return getQuestioner().c1c2().flatMap(r -> {
            if (r == TwoResponse.A) return Single.just(fState);
            return Single.just(dState);
        });
    }
}
