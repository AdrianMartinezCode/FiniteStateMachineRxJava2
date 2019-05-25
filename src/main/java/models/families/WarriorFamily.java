package models.families;

import models.villagers.ChildVillager;
import models.villagers.WarriorVillager;

import java.util.function.Supplier;

import static utils.Generators.getRandomValueFromRange;

public class WarriorFamily extends UnitFamily<WarriorVillager, WarriorVillager> {

    private static final int MAX_CHILDS = 5;
    private static final int MIN_CHILDS = 0;

    /**
     * Only provides a villager method to create a new instance of his.
     * UnitFamily controls the number of ChildVillagers are going to be created.
     * In this representation, the number of childs is immutable.
     *
     * @param firstParent
     * @param secondParent
     * @param childVillagerCreator
     */
    public WarriorFamily(WarriorVillager firstParent, WarriorVillager secondParent, Supplier<ChildVillager> childVillagerCreator) {
        super(firstParent, secondParent, childVillagerCreator);
    }

    @Override
    public int getNumberOfChilds() {
        return getRandomValueFromRange(MAX_CHILDS, MIN_CHILDS);
    }
}
