package Equipment.Armor;

import Equipment.Equipment;

public abstract class Armor extends Equipment {

    private int maxValue;
    private int value;
    private int protectionValue;

    public Armor(int lvl, int maxValue, int value, int protectionValue) {
        super(lvl);
        this.maxValue = maxValue;
        this.value = value;
        this.protectionValue = protectionValue;
    }

    @Override
    public String toString() {
        return "[maxValue = " + maxValue + ", value = " + value + ", protectionValue = " + protectionValue + "]";
    }
}
