package example.cutstates;

import finitestatemachine.ChangeStateCaller;
import finitestatemachine.basestates.BaseCutState;
import io.reactivex.Completable;

import javax.inject.Inject;
import javax.inject.Named;

public class Z extends BaseCutState {

    @Inject
    public Z(ChangeStateCaller changeStateCaller,
             @Named("Z") Completable finalAction) {
        super(changeStateCaller, finalAction);
    }
}
