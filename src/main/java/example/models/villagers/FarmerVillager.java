package example.models.villagers;

import javax.inject.Inject;

public class FarmerVillager extends Villager {

    private static final int MAX_ATTACK = 11;
    private static final int MIN_ATTACK = 6;

    private static final int MAX_STAMINA = 50;
    private static final int MIN_STAMINA = 20;

    private static final int MAX_DEFENSE = 23;
    private static final int MIN_DEFENSE = 15;

    @Inject
    public FarmerVillager() {
    }

    @Override
    public int getMaxAttack() {
        return MAX_ATTACK;
    }

    @Override
    public int getMinAttack() {
        return MIN_ATTACK;
    }

    @Override
    public int getMaxDefense() {
        return MAX_DEFENSE;
    }

    @Override
    public int getMinDefense() {
        return MIN_DEFENSE;
    }

    @Override
    public int getMaxStamina() {
        return MAX_STAMINA;
    }

    @Override
    public int getMinStamina() {
        return MIN_STAMINA;
    }
}
