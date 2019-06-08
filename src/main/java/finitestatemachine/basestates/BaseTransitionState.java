package finitestatemachine.basestates;


import finitestatemachine.ChangeStateCaller;
import example.questioneers.FiniteStateMachineQuestioner;
import io.reactivex.Completable;

public abstract class BaseTransitionState extends BaseState {

    private Completable transitionHandler;
    private FiniteStateMachineQuestioner questioner;


    public BaseTransitionState(FiniteStateMachineQuestioner questioner,
                               ChangeStateCaller changeStateCaller,
                               Completable transitionHandler) {
        super(changeStateCaller);
        this.transitionHandler = transitionHandler;
        this.questioner = questioner;
    }

    public FiniteStateMachineQuestioner getQuestioner() {
        return questioner;
    }

    @Override
    public Completable handleStateToNext() {
        return transitionHandler.andThen(handleState());
    }

    protected abstract Completable handleState();
}
