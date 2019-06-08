package example.cutstates;

import finitestatemachine.ChangeStateCaller;
import finitestatemachine.basestates.BaseCutState;
import io.reactivex.Completable;

import javax.inject.Inject;

public class X extends BaseCutState {

    @Inject
    public X(ChangeStateCaller changeStateCaller,
             Completable finalAction) {
        super(changeStateCaller, finalAction);
    }
}
