package Hero;

import Equipment.Armor.Armor;
import Equipment.Armor.KnightArmor.KnightArmor;
import Equipment.Weapon.KnightWeapon.KnightWeapon;
import Equipment.Weapon.Weapon;

public class Knight extends Hero{
    public Knight(int lvl, int maxHP, int HP, KnightWeapon weapon, KnightArmor armor) {
        super(lvl, maxHP, HP, (Weapon)weapon, (Armor)armor);
    }
}
