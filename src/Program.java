
import Equipment.Armor.ArcherArmor.ArcherArmor;
import Factories.ArmorFactory.ArcherArmorWorkshop;
import Factories.HeroFactory.ArcherFactory;
import Hero.Hero;

public class Program {
    public static void main(String[] args) {
        Hero archer = ArcherFactory.create();
        System.out.println(archer);
    }
}
