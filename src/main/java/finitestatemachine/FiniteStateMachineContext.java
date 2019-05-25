package finitestatemachine;

import java.util.concurrent.atomic.AtomicReference;

import javax.inject.Inject;

import finitestatemachine.base.BaseCutState;
import finitestatemachine.base.BaseStartState;
import finitestatemachine.base.BaseState;
import io.reactivex.Completable;

public class FiniteStateMachineContext implements ChangeStateCaller {

    private AtomicReference<BaseCutState> finalState;
    private AtomicReference<BaseState> currentState;
    //private BaseStartState startState;

    @Inject
    public FiniteStateMachineContext() {
        this.finalState = new AtomicReference<>();
        this.currentState = new AtomicReference<>();
    }

    public Completable start(BaseStartState startState) {
//        this.startState = startState;
        return startState.startFiniteStateMachine();
    }

    @Override
    public Completable onChangeState(BaseState state) {
        return Completable.fromAction(() -> currentState.set(state)).andThen(state.handleStateToNext());
    }

    @Override
    public Completable onChangeToCutState(BaseCutState state) {
        return Completable.fromAction(() -> finalState.set(state));
    }
}
