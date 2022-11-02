package Factories.HeroFactory;

import Factories.ArmorFactory.KnightArmorWorkshop;
import Factories.WeaponFactory.KnightWeaponWorkshop;
import Hero.Knight;

public class KnightFactory {

    public static Knight create(){
        return new Knight(1, 100, 100, KnightWeaponWorkshop.getInstance().createSword("bad"), KnightArmorWorkshop.getInstance().createLats("bad"));
    }
}
