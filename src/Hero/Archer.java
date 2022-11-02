package Hero;

import Equipment.Armor.ArcherArmor.ArcherArmor;
import Equipment.Armor.Armor;
import Equipment.Weapon.ArcherWeapon.ArcherWeapon;
import Equipment.Weapon.Weapon;

public class Archer extends Hero{

    public Archer(int lvl, int maxHP, int HP, ArcherWeapon weapon, ArcherArmor armor) {
        super(lvl, maxHP, HP, (Weapon)weapon, (Armor)armor);
    }
}
