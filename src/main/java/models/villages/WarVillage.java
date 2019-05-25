package models.villages;

import models.families.MixedFamily;
import models.families.PeacefulFamily;
import models.families.UnitFamily;
import models.families.WarriorFamily;

import java.util.List;
import java.util.function.Supplier;

import static utils.Generators.getRandomValueFromRange;

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
        return getRandomValueFromRange(MAX_MIXED_FAMILIES, MIN_MIXED_FAMILIES);
    }

    @Override
    public int getNumberOfWarriorFamilies() {
        return getRandomValueFromRange(MAX_WARRIOR_FAMILIES, MIN_WARRIOR_FAMILIES);
    }

    @Override
    public int getNumberOfPeacefulFamilies() {
        return getRandomValueFromRange(MAX_PEACEFUL_FAMILIES, MIN_PEACEFUL_FAMILIES);
    }
}
