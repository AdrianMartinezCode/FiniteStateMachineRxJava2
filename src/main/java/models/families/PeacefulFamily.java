package models.families;

import models.villagers.ChildVillager;
import models.villagers.FarmerVillager;

import java.util.function.Supplier;

import static utils.Generators.getRandomValueFromRange;

public class PeacefulFamily extends UnitFamily<FarmerVillager, FarmerVillager> {

    private static final int MAX_CHILDS = 15;
    private static final int MIN_CHILDS = 3;


    /**
     * Only provides a villager method to create a new instance of his.
     * UnitFamily controls the number of ChildVillagers are going to be created.
     * In this representation, the number of childs is immutable.
     *
     * @param firstParent
     * @param secondParent
     * @param childVillagerCreator
     */
    public PeacefulFamily(FarmerVillager firstParent, FarmerVillager secondParent, Supplier<ChildVillager> childVillagerCreator) {
        super(firstParent, secondParent, childVillagerCreator);
    }

    @Override
    public int getNumberOfChilds() {
        return getRandomValueFromRange(MAX_CHILDS, MIN_CHILDS);
    }
}
