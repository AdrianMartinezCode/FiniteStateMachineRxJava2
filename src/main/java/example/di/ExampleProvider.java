package example.di;

import dagger.Binds;
import dagger.Module;
import di.scopes.ExampleScope;
import example.questioneers.FiniteStateMachineQuestioner;
import example.questioneers.StubRepository;
import finitestatemachine.ChangeStateCaller;
import finitestatemachine.FiniteStateMachineContext;

import javax.inject.Singleton;

@Module
public abstract class ExampleProvider {

    @Binds
    @ExampleScope
    abstract ChangeStateCaller provideChangeStateCaller(FiniteStateMachineContext finiteStateMachineContext);

    @Binds
    @ExampleScope
    abstract FiniteStateMachineQuestioner provideFiniteStateMachineQuestioner(StubRepository stubRepository);

}
