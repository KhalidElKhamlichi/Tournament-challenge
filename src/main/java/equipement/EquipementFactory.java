package equipement;

public class EquipementFactory {

    public static Weapon getWeapon(String input) {
        if(input.equals("axe"))
            return new Axe();
        if(input.equals("sword"))
            return new Sword();
        if (input.equals("great sword"))
            return new GreatSword();

        return null;
    }

    public static Armor getArmor() {
        return new Armor();
    }

    public static Buckler getBuckler() {
        return new Buckler();
    }
}
