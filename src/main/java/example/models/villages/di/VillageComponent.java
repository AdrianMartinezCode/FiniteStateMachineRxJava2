package example.models.villages.di;

import dagger.Component;
import di.RootComponent;
import example.models.di.scopes.VillageScope;
import example.models.families.di.FamilyComponent;
import example.models.families.di.FamilyModule;
import example.models.villagers.di.VillagerModule;
import example.models.villages.PeacefulVillage;
import example.models.villages.WarVillage;

@VillageScope
@Component(
        dependencies = RootComponent.class,
        modules = VillageModule.class
)
public interface VillageComponent {

    PeacefulVillage getPeacefulVillage();

    WarVillage getWarVillage();
}
