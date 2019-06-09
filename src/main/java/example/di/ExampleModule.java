package example.di;

import dagger.Module;
import dagger.Provides;
import di.scopes.ExampleScope;
import example.main.MainProgramExample;
import finitestatemachine.FiniteStateMachineContext;
import io.reactivex.Completable;

import javax.inject.Named;

@Module
public class ExampleModule {

    @Provides
    @ExampleScope
    public MainProgramExample provideMainProgramExample() {
        return new MainProgramExample();
    }

    @Provides
    @ExampleScope
    public FiniteStateMachineContext provideFiniteStateMachineContext() {
        return new FiniteStateMachineContext();
    }

    @Provides
    @ExampleScope
    @Named("A")
    public Completable provideATransitionAction(MainProgramExample mainProgramExample) {
        return mainProgramExample.transitionA();
    }

    @Provides
    @ExampleScope
    @Named("B")
    public Completable provideBTransitionAction(MainProgramExample mainProgramExample) {
        return mainProgramExample.transitionB();
    }

    @Provides
    @ExampleScope
    @Named("C")
    public Completable provideCTransitionAction(MainProgramExample mainProgramExample) {
        return mainProgramExample.transitionC();
    }

    @Provides
    @ExampleScope
    @Named("D")
    public Completable provideDTransitionAction(MainProgramExample mainProgramExample) {
        return mainProgramExample.transitionD();
    }

    @Provides
    @ExampleScope
    @Named("E")
    public Completable provideETransitionAction(MainProgramExample mainProgramExample) {
        return mainProgramExample.transitionE();
    }

    @Provides
    @ExampleScope
    @Named("F")
    public Completable provideFTransitionAction(MainProgramExample mainProgramExample) {
        return mainProgramExample.transitionF();
    }


    @Provides
    @ExampleScope
    @Named("W")
    public Completable provideWAction(MainProgramExample mainProgramExample) {
        return mainProgramExample.finalActionW();
    }

    @Provides
    @ExampleScope
    @Named("X")
    public Completable provideXAction(MainProgramExample mainProgramExample) {
        return mainProgramExample.finalActionX();
    }

    @Provides
    @ExampleScope
    @Named("Y")
    public Completable provideYAction(MainProgramExample mainProgramExample) {
        return mainProgramExample.finalActionY();
    }

    @Provides
    @ExampleScope
    @Named("Z")
    public Completable provideZAction(MainProgramExample mainProgramExample) {
        return mainProgramExample.finalActionZ();
    }
}
