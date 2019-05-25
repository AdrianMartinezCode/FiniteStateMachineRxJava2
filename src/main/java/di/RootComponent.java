package di;

import dagger.Component;
import example.models.di.scopes.VillageScope;
import example.models.villagers.di.VillagerComponent;
import example.models.villages.di.VillageComponent;

import javax.inject.Singleton;

@Singleton
@Component(
        //dependencies = VillageComponent.class
)
public interface RootComponent {



}
