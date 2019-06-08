package finitestatemachine.basestates;


import finitestatemachine.ChangeStateCaller;
import example.questioneers.FiniteStateMachineQuestioner;
import io.reactivex.Completable;
import io.reactivex.Single;

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
        return transitionHandler.andThen(handleState()
                .flatMapCompletable(state -> getChangeStateCaller().onChangeState(state))
        );
    }

    protected abstract Single<BaseState> handleState();
}
