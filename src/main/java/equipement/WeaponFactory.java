package equipement;

import Exceptions.UnknownWeaponException;

public class WeaponFactory {

    public static Weapon getWeapon(String input) {

        if(input.equals("axe"))
            return new Axe();
        if(input.equals("sword"))
            return new Sword();
        if (input.equals("great sword"))
            return new GreatSword();

        throw new UnknownWeaponException();
    }

}
