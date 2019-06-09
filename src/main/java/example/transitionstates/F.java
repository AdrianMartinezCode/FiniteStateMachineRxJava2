package example.transitionstates;

import example.cutstates.Z;
import example.questioneers.FiniteStateMachineQuestioner;
import example.responses.ThreeResponse;
import finitestatemachine.ChangeStateCaller;
import finitestatemachine.basestates.BaseState;
import finitestatemachine.basestates.BaseTransitionState;
import io.reactivex.Completable;
import io.reactivex.Single;

import javax.inject.Inject;
import javax.inject.Named;

public class F extends BaseTransitionState<FiniteStateMachineQuestioner> {

    private D dState;
    private E eState;
    private Z zState;

    @Inject
    public F(FiniteStateMachineQuestioner questioner,
             ChangeStateCaller changeStateCaller,
             @Named("F") Completable transitionHandler,
             D dState,
             E eState,
             Z zState) {
        super(questioner, changeStateCaller, transitionHandler);
        this.dState = dState;
        this.eState = eState;
        this.zState = zState;
    }

    @Override
    protected Single<BaseState> handleState() {
        return getQuestioner().f1f2f3().flatMap(r -> {
            if (r == ThreeResponse.A) return Single.just(dState);
            if (r == ThreeResponse.B) return Single.just(eState);
            return Single.just(zState);
        });
    }
}
