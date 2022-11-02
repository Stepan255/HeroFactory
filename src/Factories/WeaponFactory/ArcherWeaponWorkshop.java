package Factories.WeaponFactory;

import Equipment.Weapon.ArcherWeapon.ArcherWeapon;
import Equipment.Weapon.ArcherWeapon.Onions.BadArcherOnion;
import Equipment.Weapon.ArcherWeapon.Onions.GoodArcherOnion;

public class ArcherWeaponWorkshop {
    private static ArcherWeaponWorkshop archerWeaponWorkshop;

    private ArcherWeaponWorkshop() {
    }

    public static ArcherWeaponWorkshop getInstance(){
        if (archerWeaponWorkshop == null){
            archerWeaponWorkshop = new ArcherWeaponWorkshop();
        }
        return archerWeaponWorkshop;
    }
    // TODO
    public ArcherWeapon createOnion(String type) {
        switch (type) {
            case ("bad"):
                return new BadArcherOnion(1, 2, 3);
            case ("good"):
                return new GoodArcherOnion(4, 4, 6);
            default:
                return null; // todo remove NULL
        }
    }
}
