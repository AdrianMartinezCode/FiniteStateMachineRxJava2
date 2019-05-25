package example.models.villages.di;

import dagger.Module;
import dagger.Provides;
import example.models.di.scopes.FamilyScope;
import example.models.di.scopes.VillageScope;
import example.models.families.MixedFamily;
import example.models.families.PeacefulFamily;
import example.models.families.WarriorFamily;

import java.util.function.Supplier;

@Module
public class VillageModule {

    @Provides
    @VillageScope
    public Supplier<MixedFamily> provideSupplierMixedFamily(MixedFamily mixedFamily) {
        return () -> mixedFamily;
    }

    @Provides
    @VillageScope
    public Supplier<PeacefulFamily> provideSupplierPeacefulFamily(PeacefulFamily peacefulFamily) {
        return () -> peacefulFamily;
    }

    @Provides
    @VillageScope
    public Supplier<WarriorFamily> provideSupplierWarriorFamily(WarriorFamily warriorFamily) {
        return () -> warriorFamily;
    }
}
