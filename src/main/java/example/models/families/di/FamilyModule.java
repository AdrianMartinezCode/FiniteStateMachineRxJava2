package example.models.families.di;

import dagger.Module;
import dagger.Provides;
import example.models.di.scopes.FamilyScope;
import example.models.di.scopes.VillagerScope;
import example.models.families.MixedFamily;
import example.models.families.PeacefulFamily;
import example.models.families.WarriorFamily;
import example.models.villagers.ChildVillager;

import java.util.function.Supplier;

@Module
public class FamilyModule {

    @Provides
    @FamilyScope
    public Supplier<ChildVillager> provideSupplierChildVillager(ChildVillager childVillager) {
        return () -> childVillager;
    }

}
