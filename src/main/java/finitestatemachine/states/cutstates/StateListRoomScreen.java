package finitestatemachine.states.cutstates;

import com.example.zonetacts.zonetacts.ui.login.finitestatemachine.ChangeStateCaller;
import com.example.zonetacts.zonetacts.ui.login.finitestatemachine.CutState;
import com.example.zonetacts.zonetacts.ui.login.finitestatemachine.base.BaseCutState;

import javax.inject.Inject;

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
