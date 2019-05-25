package finitestatemachine;


import finitestatemachine.base.BaseCutState;
import finitestatemachine.base.BaseState;
import io.reactivex.Completable;

public interface ChangeStateCaller {

    Completable onChangeState(BaseState state);
    Completable onChangeToCutState(BaseCutState state);
}
