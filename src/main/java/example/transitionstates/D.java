package example.transitionstates;

import example.cutstates.X;
import example.cutstates.Y;
import example.questioneers.FiniteStateMachineQuestioner;
import example.responses.TwoResponse;
import finitestatemachine.ChangeStateCaller;
import finitestatemachine.basestates.BaseState;
import finitestatemachine.basestates.BaseTransitionState;
import io.reactivex.Completable;
import io.reactivex.Single;

import javax.inject.Inject;
import javax.inject.Named;

public class D extends BaseTransitionState {

    private X xState;
    private Y yState;

    @Inject
    public D(FiniteStateMachineQuestioner questioner,
             ChangeStateCaller changeStateCaller,
             @Named("D") Completable transitionHandler,
             X xState,
             Y yState) {
        super(questioner, changeStateCaller, transitionHandler);
        this.xState = xState;
        this.yState = yState;
    }

    @Override
    protected Single<BaseState> handleState() {
        return getQuestioner().d1d2().flatMap(r -> {
            if (r == TwoResponse.A) return Single.just(xState);
            return Single.just(yState);
        });
    }
}
