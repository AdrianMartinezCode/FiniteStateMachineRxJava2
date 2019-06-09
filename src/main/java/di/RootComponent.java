package di;

import dagger.Component;
import di.scopes.ExampleScope;
import example.di.ExampleModule;
import example.di.ExampleProvider;
import example.main.MainProgramExample;

import javax.inject.Singleton;

@ExampleScope
@Component(modules = {
        ExampleModule.class,
        ExampleProvider.class,
})
public interface RootComponent {

    void inject(MainProgramExample mainProgramExample);

}
