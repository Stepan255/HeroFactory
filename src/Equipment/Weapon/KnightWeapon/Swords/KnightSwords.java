package Equipment.Weapon.KnightWeapon.Swords;

import Equipment.Weapon.KnightWeapon.KnightWeapon;
import Equipment.Weapon.Weapon;

public abstract class KnightSwords extends Weapon implements KnightWeapon {

    public KnightSwords(int lvl, int minDPS, int maxDPS) {
        super(lvl, minDPS, maxDPS);
    }
}
