package Factories.HeroFactory;

import Factories.ArmorFactory.ArcherArmorWorkshop;
import Factories.WeaponFactory.ArcherWeaponWorkshop;
import Hero.Archer;

public class ArcherFactory {

    private ArcherFactory() {
    }

    public static Archer create(){
        return new Archer(1, 100, 100, ArcherWeaponWorkshop.getInstance().createOnion("bad"), ArcherArmorWorkshop.getInstance().createBrigantine("bad"));
    }
}
