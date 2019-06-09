package example.main;

import di.scopes.ExampleScope;
import example.transitionstates.A;
import finitestatemachine.FiniteStateMachineContext;
import io.reactivex.Completable;

import javax.inject.Inject;

@ExampleScope
public class MainProgramExample {

    @Inject
    A startState;

    @Inject
    FiniteStateMachineContext finiteStateMachineContext;

    public MainProgramExample() {
    }

    public void start() {

    }


    public Completable transitionA () {
        return Completable.fromAction(() -> System.out.println("DOING AN ACTION TO SATISFIES THE POSTCONDITION OF A STATE"));
    }
    public Completable transitionB () {
        return Completable.fromAction(() -> System.out.println("DOING AN ACTION TO SATISFIES THE POSTCONDITION OF B STATE"));
    }
    public Completable transitionC () {
        return Completable.fromAction(() -> System.out.println("DOING AN ACTION TO SATISFIES THE POSTCONDITION OF C STATE"));
    }
    public Completable transitionD () {
        return Completable.fromAction(() -> System.out.println("DOING AN ACTION TO SATISFIES THE POSTCONDITION OF D STATE"));
    }
    public Completable transitionE () {
        return Completable.fromAction(() -> System.out.println("DOING AN ACTION TO SATISFIES THE POSTCONDITION OF E STATE"));
    }
    public Completable transitionF () {
        return Completable.fromAction(() -> System.out.println("DOING AN ACTION TO SATISFIES THE POSTCONDITION OF F STATE"));
    }


    public Completable finalActionW() {
        return Completable.fromAction(() -> System.out.println("THE FINAL STATE IS W!"));
    }
    public Completable finalActionX() {
        return Completable.fromAction(() -> System.out.println("THE FINAL STATE IS X!"));
    }
    public Completable finalActionY() {
        return Completable.fromAction(() -> System.out.println("THE FINAL STATE IS Y!"));
    }
    public Completable finalActionZ() {
        return Completable.fromAction(() -> System.out.println("THE FINAL STATE IS Z!"));
    }
}
