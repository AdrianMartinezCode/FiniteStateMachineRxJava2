package example.models.villagers;

import static example.utils.Generators.getRandomValueFromRange;

public abstract class Villager {

    private final int stamina;
    private final int attack;
    private final int defense;


    Villager() {
        attack = getRandomValueFromRange(getMaxAttack(), getMinAttack());
        stamina = getRandomValueFromRange(getMaxDefense(), getMinDefense());
        defense = getRandomValueFromRange(getMaxStamina(), getMinStamina());
    }


    public int getStamina() {
        return stamina;
    }

    public int getAttack() {
        return attack;
    }

    public int getDefense() {
        return defense;
    }



    public abstract int getMaxAttack();
    public abstract int getMinAttack();
    public abstract int getMaxDefense();
    public abstract int getMinDefense();
    public abstract int getMaxStamina();
    public abstract int getMinStamina();
}
