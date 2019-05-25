package example.models.villages;

import example.models.families.MixedFamily;
import example.models.families.PeacefulFamily;
import example.models.families.WarriorFamily;

import javax.inject.Inject;
import java.util.function.Supplier;

import static example.utils.Generators.getRandomValueFromRange;

public class WarVillage extends Village {


    private static final int MAX_MIXED_FAMILIES = 5;
    private static final int MIN_MIXED_FAMILIES = 2;

    private static final int MAX_WARRIOR_FAMILIES = 10;
    private static final int MIN_WARRIOR_FAMILIES = 5;

    private static final int MAX_PEACEFUL_FAMILIES = 3;
    private static final int MIN_PEACEFUL_FAMILIES = 1;

    @Inject
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
