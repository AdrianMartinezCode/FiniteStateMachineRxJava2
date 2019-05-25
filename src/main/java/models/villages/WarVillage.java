package models.villages;

import models.families.MixedFamily;
import models.families.PeacefulFamily;
import models.families.UnitFamily;
import models.families.WarriorFamily;

import java.util.List;
import java.util.function.Supplier;

public class WarVillage extends Village {


    private static final int MAX_MIXED_FAMILIES = 5;
    private static final int MIN_MIXED_FAMILIES = 2;

    private static final int MAX_WARRIOR_FAMILIES = 10;
    private static final int MIN_WARRIOR_FAMILIES = 5;

    private static final int MAX_PEACEFUL_FAMILIES = 3;
    private static final int MIN_PEACEFUL_FAMILIES = 1;


    public WarVillage(Supplier<MixedFamily> mixedFamilySupplier,
                      Supplier<WarriorFamily> warriorFamilySupplier,
                      Supplier<PeacefulFamily> peacefulFamilySupplier) {
        super(mixedFamilySupplier, warriorFamilySupplier, peacefulFamilySupplier);
    }

    @Override
    public int getNumberOfMixedFamilies() {
        return 0;
    }

    @Override
    public int getNumberOfWarriorFamilies() {
        return 0;
    }

    @Override
    public int getNumberOfPeacefulFamilies() {
        return 0;
    }
}
