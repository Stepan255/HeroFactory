package Hero;

import Equipment.Armor.Armor;
import Equipment.Weapon.Weapon;

public abstract class Hero {
    private int lvl;
    private int maxHP;
    private int HP;
    private Weapon weapon;
    private Armor armor;

    protected Hero(int lvl, int maxHP, int HP, Weapon weapon, Armor armor) {
        this.lvl = lvl;
        this.maxHP = maxHP;
        this.HP = HP;
        this.weapon = weapon;
        this.armor = armor;
    }

    @Override
    public String toString() {
        return "[lvl = " + lvl + ", HP = " + HP + ", maxHP = " + maxHP + ", weapon = " + weapon + ", armor = " + armor + "]";
    }
}
