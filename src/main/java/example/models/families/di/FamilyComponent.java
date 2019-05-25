package example.models.families.di;

import dagger.Component;
import example.models.di.scopes.FamilyScope;
import example.models.families.MixedFamily;
import example.models.families.PeacefulFamily;
import example.models.families.WarriorFamily;
import example.models.villagers.di.VillagerComponent;
import example.models.villagers.di.VillagerModule;
import example.models.villages.di.VillageComponent;

import java.util.function.Supplier;

@FamilyScope
@Component(
        dependencies = VillageComponent.class,
        modules = FamilyModule.class
//        modules = VillagerModule.class
)
public interface FamilyComponent {

    MixedFamily getMixedFamily();

    PeacefulFamily getPeacefulFamily();

    WarriorFamily getWarriorFamily();

//    @FamilyScope
//    Supplier<MixedFamily> provideSupplierMixedFamily(Supplier<MixedFamily> familySupplier);
//
//    @FamilyScope
//    Supplier<PeacefulFamily> provideSupplierPeacefulFamily(Supplier<PeacefulFamily> familySupplier);
//
//    @FamilyScope
//    Supplier<WarriorFamily> provideSupplierWarriorFamily(Supplier<WarriorFamily> familySupplier);
}
