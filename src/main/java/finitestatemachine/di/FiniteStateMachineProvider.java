package finitestatemachine.di;

import dagger.Binds;
import dagger.Module;
import finitestatemachine.ChangeStateCaller;
import finitestatemachine.FiniteStateMachineContext;

@Module
public abstract class FiniteStateMachineProvider {

    @Binds
    abstract ChangeStateCaller provideChangeStateCaller(FiniteStateMachineContext finiteStateMachineContext);
}
