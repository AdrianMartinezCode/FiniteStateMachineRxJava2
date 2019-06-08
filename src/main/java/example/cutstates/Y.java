package example.cutstates;

import finitestatemachine.ChangeStateCaller;
import finitestatemachine.basestates.BaseCutState;
import io.reactivex.Completable;

public class Y extends BaseCutState {
    public Y(ChangeStateCaller changeStateCaller,
             Completable finalAction) {
        super(changeStateCaller, finalAction);
    }
}
