package example.cutstates;

import finitestatemachine.ChangeStateCaller;
import finitestatemachine.basestates.BaseCutState;
import io.reactivex.Completable;

import javax.inject.Inject;
import javax.inject.Named;

public class Y extends BaseCutState {

    @Inject
    public Y(ChangeStateCaller changeStateCaller,
             @Named("Y") Completable finalAction) {
        super(changeStateCaller, finalAction);
    }
}
