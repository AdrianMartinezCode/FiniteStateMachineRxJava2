package example.models.villagers.di;

import dagger.Component;
import example.models.di.scopes.VillagerScope;
import example.models.families.di.FamilyComponent;
import example.models.villagers.ChildVillager;
import example.models.villagers.FarmerVillager;
import example.models.villagers.WarriorVillager;

import java.util.function.Supplier;

@VillagerScope
@Component(
        dependencies = FamilyComponent.class,
        modules = VillagerModule.class
)
public interface VillagerComponent {

    ChildVillager getChildVillager();

    FarmerVillager getFarmerVillager();

    WarriorVillager getWarriorVillager();

//    @VillagerScope
//    Supplier<ChildVillager> provideSupplierChildVillager(Supplier<ChildVillager> villagerSupplier);
}
