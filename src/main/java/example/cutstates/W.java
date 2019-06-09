package example.cutstates;

import finitestatemachine.ChangeStateCaller;
import finitestatemachine.basestates.BaseCutState;
import io.reactivex.Completable;

import javax.inject.Inject;
import javax.inject.Named;

public class W extends BaseCutState {

    @Inject
    public W(ChangeStateCaller changeStateCaller,
             @Named("W") Completable finalAction) {
        super(changeStateCaller, finalAction);
    }
}
