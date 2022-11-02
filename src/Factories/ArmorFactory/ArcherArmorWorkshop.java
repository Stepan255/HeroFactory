package Factories.ArmorFactory;

import Equipment.Armor.ArcherArmor.ArcherArmor;
import Equipment.Armor.ArcherArmor.Brigantine.BadArcherBrigantine;
import Equipment.Armor.ArcherArmor.Brigantine.GoodArcherBrigantine;

public class ArcherArmorWorkshop {

    private static ArcherArmorWorkshop archerArmorWorkshop;

    private ArcherArmorWorkshop() {
    }

    public static ArcherArmorWorkshop getInstance(){
        if (archerArmorWorkshop == null){
            archerArmorWorkshop = new ArcherArmorWorkshop();
        }
        return archerArmorWorkshop;
    }

    // TODO
    public ArcherArmor createBrigantine(String type){
        switch (type) {
            case ("bad"):
                return new BadArcherBrigantine(1, 2, 2, 1);
            case ("good"):
                return new GoodArcherBrigantine(4, 4, 4, 2);
            default:
                return null; // todo remove NULL
        }
    }
}
