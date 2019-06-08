package example.cutstates;

import finitestatemachine.ChangeStateCaller;
import finitestatemachine.basestates.BaseCutState;
import io.reactivex.Completable;

public class Z extends BaseCutState {
    public Z(ChangeStateCaller changeStateCaller,
             Completable finalAction) {
        super(changeStateCaller, finalAction);
    }
}
