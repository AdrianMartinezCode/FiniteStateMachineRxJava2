package models.villagers;

public class WarriorVillager extends Villager {

    private static final int MAX_ATTACK = 29;
    private static final int MIN_ATTACK = 25;

    private static final int MAX_STAMINA = 36;
    private static final int MIN_STAMINA = 30;

    private static final int MAX_DEFENSE = 15;
    private static final int MIN_DEFENSE = 12;


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
