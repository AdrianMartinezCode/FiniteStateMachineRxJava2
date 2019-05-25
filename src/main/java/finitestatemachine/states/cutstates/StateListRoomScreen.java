package finitestatemachine.states.cutstates;


import javax.inject.Inject;

import finitestatemachine.ChangeStateCaller;
import finitestatemachine.CutState;
import finitestatemachine.base.BaseCutState;
import io.reactivex.Completable;

public class StateListRoomScreen extends BaseCutState {

    // Callables
    private Completable listRoomScreenAction;

    @Inject
    public StateListRoomScreen(ChangeStateCaller changeStateCaller,
                               Completable listRoomScreenAction) {
        super(changeStateCaller);
        this.listRoomScreenAction = listRoomScreenAction;
    }

    @Override
    public CutState getCutState() {
        return CutState.LISTROOMSCREEN;
    }

    @Override
    public Completable getScreenAction() {
        return listRoomScreenAction;
    }

}
