package finitestatemachine;

import java.util.concurrent.atomic.AtomicReference;

import finitestatemachine.basestates.BaseCutState;
import finitestatemachine.basestates.BaseStartState;
import finitestatemachine.basestates.BaseState;
import io.reactivex.Completable;

public class FiniteStateMachineContext implements ChangeStateCaller {

    private AtomicReference<BaseCutState> finalState;
    private AtomicReference<BaseState> currentState;

    public FiniteStateMachineContext() {
        this.finalState = new AtomicReference<>();
        this.currentState = new AtomicReference<>();
    }

    public Completable start(BaseStartState startState) {
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
