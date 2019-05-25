package finitestatemachine;

import io.reactivex.Single;

public interface FiniteStateMachineQuestioner {

    Single<Boolean> hasToken();
    Single<Boolean> hasDataUser();

    Single<Boolean> tokenStoredIsValid();
    Single<Boolean> dataUserStoredIsValid();

    //Single<Boolean> dataUserIsValid();
    Single<Boolean> requiredRegister();

//    Completable performLogin();

}
