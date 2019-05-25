package example.models.villagers;

public class ChildVillager extends Villager {

    private static final int MAX_ATTACK = 2;
    private static final int MIN_ATTACK = 1;

    private static final int MAX_STAMINA = 10;
    private static final int MIN_STAMINA = 4;

    private static final int MAX_DEFENSE = 2;
    private static final int MIN_DEFENSE = 1;


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
