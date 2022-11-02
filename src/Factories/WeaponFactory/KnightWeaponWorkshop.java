package Factories.WeaponFactory;

import Equipment.Weapon.KnightWeapon.KnightWeapon;
import Equipment.Weapon.KnightWeapon.Swords.BadKnightSwords;
import Equipment.Weapon.KnightWeapon.Swords.GoodKnightSwords;

public class KnightWeaponWorkshop {

    private static KnightWeaponWorkshop knightWeaponWorkshop;

    private KnightWeaponWorkshop() {
    }

    public static KnightWeaponWorkshop getInstance(){
        if (knightWeaponWorkshop == null){
            knightWeaponWorkshop = new KnightWeaponWorkshop();
        }
        return knightWeaponWorkshop;
    }
    // TODO
    public KnightWeapon createSword(String type){

        switch (type) {
            case ("bad"):
                return new BadKnightSwords(1, 2, 3);
            case ("good"):
                return new GoodKnightSwords(4, 4, 6);
            default:
                return null; // todo remove NULL
        }
    }
}
