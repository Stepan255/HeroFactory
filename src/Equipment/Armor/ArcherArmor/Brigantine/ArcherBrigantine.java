package Equipment.Armor.ArcherArmor.Brigantine;

import Equipment.Armor.ArcherArmor.ArcherArmor;
import Equipment.Armor.Armor;

public abstract class ArcherBrigantine extends Armor implements ArcherArmor {

    public ArcherBrigantine(int lvl, int maxValue, int value, int protectionValue) {
        super(lvl, maxValue, value, protectionValue);
    }
}
