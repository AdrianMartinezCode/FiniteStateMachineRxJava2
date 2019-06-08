package finitestatemachine;


import finitestatemachine.basestates.BaseCutState;
import finitestatemachine.basestates.BaseState;
import io.reactivex.Completable;

public interface ChangeStateCaller {

    Completable onChangeState(BaseState state);
    Completable onChangeToCutState(BaseCutState state);
}
