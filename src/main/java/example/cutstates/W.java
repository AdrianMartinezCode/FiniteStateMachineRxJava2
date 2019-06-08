package example.cutstates;

import finitestatemachine.ChangeStateCaller;
import finitestatemachine.basestates.BaseCutState;
import io.reactivex.Completable;

public class W extends BaseCutState {

    public W(ChangeStateCaller changeStateCaller,
             Completable finalAction) {
        super(changeStateCaller, finalAction);
    }
}
