package Equipment.Armor.KnightArmor.Lats;

import Equipment.Armor.Armor;
import Equipment.Armor.KnightArmor.KnightArmor;

public abstract class KnightLats extends Armor implements KnightArmor {

    public KnightLats(int lvl, int maxValue, int value, int protectionValue) {
        super(lvl, maxValue, value, protectionValue);
    }
}
