package example.cutstates;

import finitestatemachine.ChangeStateCaller;
import finitestatemachine.basestates.BaseCutState;
import io.reactivex.Completable;

import javax.inject.Inject;
import javax.inject.Named;

public class X extends BaseCutState {

    @Inject
    public X(ChangeStateCaller changeStateCaller,
             @Named("X") Completable finalAction) {
        super(changeStateCaller, finalAction);
    }
}
