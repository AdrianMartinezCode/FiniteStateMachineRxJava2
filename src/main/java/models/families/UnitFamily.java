package models.families;

import models.villagers.ChildVillager;
import models.villagers.Villager;

import java.util.List;

public abstract class UnitFamily<K extends Villager, T extends Villager> {

    private K firstParent;
    private T secondParent;
    private List<ChildVillager> childs;


}
