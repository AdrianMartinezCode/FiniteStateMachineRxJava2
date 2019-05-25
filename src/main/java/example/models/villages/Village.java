package example.models.villages;

import example.models.families.MixedFamily;
import example.models.families.PeacefulFamily;
import example.models.families.UnitFamily;
import example.models.families.WarriorFamily;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public abstract class Village {

    private final List<UnitFamily> unitFamilies;

    Village(Supplier<MixedFamily> mixedFamilySupplier,
            Supplier<WarriorFamily> warriorFamilySupplier,
            Supplier<PeacefulFamily> peacefulFamilySupplier) {
        unitFamilies = Stream.concat(
                Stream.generate(mixedFamilySupplier).limit(getNumberOfMixedFamilies()),
                Stream.concat(
                        Stream.generate(warriorFamilySupplier).limit(getNumberOfWarriorFamilies()),
                        Stream.generate(peacefulFamilySupplier).limit(getNumberOfPeacefulFamilies())
                )
        ).collect(Collectors.toList());
    }

    public List<UnitFamily> getUnitFamilies() {
        return new ArrayList<>(unitFamilies);
    }

    public abstract int getNumberOfMixedFamilies();
    public abstract int getNumberOfWarriorFamilies();
    public abstract int getNumberOfPeacefulFamilies();
}