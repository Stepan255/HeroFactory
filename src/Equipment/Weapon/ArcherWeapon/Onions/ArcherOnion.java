package Equipment.Weapon.ArcherWeapon.Onions;

import Equipment.Weapon.ArcherWeapon.ArcherWeapon;
import Equipment.Weapon.Weapon;

public abstract class ArcherOnion extends Weapon implements ArcherWeapon {

    public ArcherOnion(int lvl, int minDPS, int maxDPS) {
        super(lvl, minDPS, maxDPS);
    }
}
