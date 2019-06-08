package example.transitionstates;

import example.questioneers.FiniteStateMachineQuestioner;
import example.responses.TwoResponse;
import finitestatemachine.ChangeStateCaller;
import finitestatemachine.basestates.BaseStartState;
import finitestatemachine.basestates.BaseState;
import io.reactivex.Completable;
import io.reactivex.Single;

import javax.inject.Inject;
import javax.inject.Named;

public class A extends BaseStartState {

    private B bState;
    private C cState;

    @Inject
    public A(FiniteStateMachineQuestioner transitionsActions,
             ChangeStateCaller changeStateCaller,
             @Named("A") Completable transitionHandler,
             B bState,
             C cState) {
        super(transitionsActions, changeStateCaller, transitionHandler);
        this.bState = bState;
        this.cState = cState;
    }

    @Override
    protected Single<BaseState> handleState() {
        return getQuestioner().a1a2().flatMap(r -> {
            if (r == TwoResponse.A) return Single.just(bState);
            return Single.just(cState);
        });
    }
}
