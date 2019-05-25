package models.families;

import models.villagers.ChildVillager;
import models.villagers.FarmerVillager;
import models.villagers.WarriorVillager;

import java.util.function.Supplier;

import static utils.Generators.getRandomValueFromRange;

public class MixedFamily extends UnitFamily<WarriorVillager, FarmerVillager> {

    private static final int MAX_CHILDS = 10;
    private static final int MIN_CHILDS = 1;

    /**
     * Only provides a villager method to create a new instance of his.
     * UnitFamily controls the number of ChildVillagers are going to be created.
     * In this representation, the number of childs is immutable.
     *
     * @param firstParent
     * @param secondParent
     * @param childVillagerCreator
     */
    public MixedFamily(WarriorVillager firstParent, FarmerVillager secondParent, Supplier<ChildVillager> childVillagerCreator) {
        super(firstParent, secondParent, childVillagerCreator);
    }


    @Override
    public int getNumberOfChilds() {
        return getRandomValueFromRange(MAX_CHILDS, MIN_CHILDS);
    }
}
