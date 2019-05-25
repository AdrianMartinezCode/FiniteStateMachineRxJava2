package models.villagers;

public abstract class Villager {

    private int stamina;
    private int attack;
    private int defense;


    public Villager() {
        setAttack(getRandomValueFromRange(getMaxAttack(), getMinAttack()));
        setStamina(getRandomValueFromRange(getMaxDefense(), getMinDefense()));
        setDefense(getRandomValueFromRange(getMaxStamina(), getMinStamina()));
    }


    public int getStamina() {
        return stamina;
    }

    private void setStamina(int stamina) {
        this.stamina = stamina;
    }

    public int getAttack() {
        return attack;
    }

    private void setAttack(int attack) {
        this.attack = attack;
    }

    public int getDefense() {
        return defense;
    }

    private void setDefense(int defense) {
        this.defense = defense;
    }


    private static int getRandomValueFromRange(int max, int min) {
        return ((int) (Math.random() * (max - min))) + 1 + min;
    }

    public abstract int getMaxAttack();
    public abstract int getMinAttack();
    public abstract int getMaxDefense();
    public abstract int getMinDefense();
    public abstract int getMaxStamina();
    public abstract int getMinStamina();
}
