package finitestatemachine.base;


import finitestatemachine.ChangeStateCaller;
import finitestatemachine.CutState;
import io.reactivex.Completable;

public abstract class BaseCutState extends BaseState {

    public BaseCutState(ChangeStateCaller changeStateCaller) {
        super(changeStateCaller);
    }

    public abstract CutState getCutState();
    public abstract Completable getScreenAction();

    @Override
    public Completable handleStateToNext() {
        return getScreenAction()
                .andThen(getChangeStateCaller().onChangeToCutState(this));
    }
}
