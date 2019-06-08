package example.questioneers;

import example.responses.OneResponse;
import example.responses.ThreeResponse;
import example.responses.TwoResponse;
import io.reactivex.Single;

import javax.inject.Inject;
import javax.inject.Singleton;

@Singleton
public class StubRepository implements FiniteStateMachineQuestioner {

    @Inject
    public StubRepository() {
    }

    private static double getRandom() {
        return Math.random();
    }
    private static OneResponse getRandomOneResponse() {
        return OneResponse.A;
    }
    private static TwoResponse getRandomTwoResponse() {
        return getRandom() < 0.5 ? TwoResponse.A : TwoResponse.B;
    }
    private static ThreeResponse getRandomThreeResponse() {
        double rand = Math.random();
        return rand < 1.0/3.0 ? ThreeResponse.A : (rand < 2.0/3.0 ? ThreeResponse.B : ThreeResponse.C);
    }

    @Override
    public Single<TwoResponse> a1a2() {
        return Single.just(getRandomTwoResponse());
    }

    @Override
    public Single<TwoResponse> b1b2() {
        return Single.just(getRandomTwoResponse());
    }

    @Override
    public Single<TwoResponse> c1c2() {
        return Single.just(getRandomTwoResponse());
    }

    @Override
    public Single<TwoResponse> d1d2() {
        return Single.just(getRandomTwoResponse());
    }

    @Override
    public Single<OneResponse> e1() {
        return Single.just(getRandomOneResponse());
    }

    @Override
    public Single<ThreeResponse> f1f2f3() {
        return Single.just(getRandomThreeResponse());
    }
}
