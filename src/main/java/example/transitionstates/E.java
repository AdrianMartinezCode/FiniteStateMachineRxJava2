package example.transitionstates;

import example.cutstates.W;
import example.questioneers.FiniteStateMachineQuestioner;
import example.responses.TwoResponse;
import finitestatemachine.ChangeStateCaller;
import finitestatemachine.basestates.BaseState;
import finitestatemachine.basestates.BaseTransitionState;
import io.reactivex.Completable;
import io.reactivex.Single;

import javax.inject.Inject;
import javax.inject.Named;

public class E extends BaseTransitionState {

    private W wState;

    @Inject
    public E(FiniteStateMachineQuestioner questioner,
             ChangeStateCaller changeStateCaller,
             @Named("E") Completable transitionHandler,
             W wState) {
        super(questioner, changeStateCaller, transitionHandler);
        this.wState = wState;
    }

    @Override
    protected Single<BaseState> handleState() {
        return getQuestioner().e1().flatMap(r -> Single.just(wState));
    }
}
