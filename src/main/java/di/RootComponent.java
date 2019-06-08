package di;

import dagger.Component;
import example_villageworld.models.di.scopes.VillageScope;
import example_villageworld.models.villagers.di.VillagerComponent;
import example_villageworld.models.villages.di.VillageComponent;

import javax.inject.Singleton;

@Singleton
@Component()
public interface RootComponent {



}
