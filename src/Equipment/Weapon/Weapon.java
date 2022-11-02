package Equipment.Weapon;

import Equipment.Equipment;

public abstract class Weapon extends Equipment {

    private int minDPS;
    private int maxDPS;

    public Weapon(int lvl, int minDPS, int maxDPS) {
        super(lvl);
        this.minDPS = minDPS;
        this.maxDPS = maxDPS;
    }

    @Override
    public String toString() {
        return "[minDPS = " + minDPS + ", maxDPS = " + maxDPS + "]";
    }
}
