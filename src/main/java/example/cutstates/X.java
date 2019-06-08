package example.cutstates;

import finitestatemachine.ChangeStateCaller;
import finitestatemachine.basestates.BaseCutState;
import io.reactivex.Completable;

public class X extends BaseCutState {
    public X(ChangeStateCaller changeStateCaller,
             Completable finalAction) {
        super(changeStateCaller, finalAction);
    }
}
