package example.questioneers;

import example.responses.OneResponse;
import example.responses.ThreeResponse;
import example.responses.TwoResponse;
import io.reactivex.Single;

public interface FiniteStateMachineQuestioner {

    /*
        It can be separately interface for every transition question,
        but, the graph isn't huge for this, it is more feasible to do like that.
     */
    Single<TwoResponse> a1a2();
    Single<TwoResponse> b1b2();
    Single<TwoResponse> c1c2();
    Single<TwoResponse> d1d2();
    Single<OneResponse> e1();
    Single<ThreeResponse> f1f2f3();

}
