package finitestatemachine.base;


import finitestatemachine.ChangeStateCaller;
import finitestatemachine.FiniteStateMachineQuestioner;
import io.reactivex.Completable;

public abstract class BaseTransitionState extends BaseState {

    private Completable transitionHandler;
    private FiniteStateMachineQuestioner transitionsActions;


    public BaseTransitionState(FiniteStateMachineQuestioner transitionsActions, ChangeStateCaller changeStateCaller, Completable transitionHandler) {
        super(changeStateCaller);
        this.transitionHandler = transitionHandler;
        this.transitionsActions = transitionsActions;
    }

    public FiniteStateMachineQuestioner getTransitionsActions() {
        return transitionsActions;
    }

    @Override
    public Completable handleStateToNext() {
        return transitionHandler.andThen(handleState());
    }

    protected abstract Completable handleState();
}
