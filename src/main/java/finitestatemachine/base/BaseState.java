package finitestatemachine.base;

import finitestatemachine.ChangeStateCaller;
import io.reactivex.Completable;

public abstract class BaseState {

    private ChangeStateCaller changeStateCaller;

    public BaseState(ChangeStateCaller changeStateCaller) {
        this.changeStateCaller = changeStateCaller;
    }

    public abstract Completable handleStateToNext();

    public ChangeStateCaller getChangeStateCaller() {
        return changeStateCaller;
    }

}
