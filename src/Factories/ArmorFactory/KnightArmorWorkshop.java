package Factories.ArmorFactory;

import Equipment.Armor.KnightArmor.KnightArmor;
import Equipment.Armor.KnightArmor.Lats.BadKnightLats;
import Equipment.Armor.KnightArmor.Lats.GoodKnightLats;

public class KnightArmorWorkshop {
    private static KnightArmorWorkshop knightArmorWorkshop;

    private KnightArmorWorkshop() {
    }

    public static KnightArmorWorkshop getInstance(){
        if (knightArmorWorkshop == null){
            knightArmorWorkshop = new KnightArmorWorkshop();
        }
        return knightArmorWorkshop;
    }

    // TODO
    public KnightArmor createLats(String type){
        switch (type) {
            case ("bad"):
                return new BadKnightLats(1, 2, 2, 1);
            case ("good"):
                return new GoodKnightLats(4, 4, 4, 2);
            default:
                return null; // todo remove NULL
        }
    }
}
