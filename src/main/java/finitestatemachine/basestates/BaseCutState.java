package finitestatemachine.basestates;


import finitestatemachine.ChangeStateCaller;
import io.reactivex.Completable;

public abstract class BaseCutState extends BaseState {

    private Completable finalAction;

    public BaseCutState(ChangeStateCaller changeStateCaller,
                        Completable finalAction) {
        super(changeStateCaller);
        this.finalAction = finalAction;
    }

    @Override
    public Completable handleStateToNext() {
        return finalAction.andThen(getChangeStateCaller().onChangeToCutState(this));
    }
}
