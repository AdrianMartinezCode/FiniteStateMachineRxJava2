package models.families;

import models.villagers.ChildVillager;
import models.villagers.Villager;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public abstract class UnitFamily<K extends Villager, T extends Villager> {

    private final K firstParent;
    private final T secondParent;
    private final List<ChildVillager> childs;

    /**
     *
     * Only provides a villager method to create a new instance of his.
     * UnitFamily controls the number of ChildVillagers are going to be created.
     * In this representation, the number of childs is immutable.
     */
    UnitFamily(K firstParent, T secondParent, Supplier<ChildVillager> childVillagerCreator) {
        this.firstParent = firstParent;
        this.secondParent = secondParent;
        this.childs = Stream.generate(childVillagerCreator)
                                .limit(getNumberOfChilds())
                                .collect(Collectors.toList());
    }

    public K getFirstParent() {
        return firstParent;
    }

    public T getSecondParent() {
        return secondParent;
    }

    public List<ChildVillager> getChilds() {
        return new ArrayList<>(childs);
    }

    public abstract int getNumberOfChilds();
}
