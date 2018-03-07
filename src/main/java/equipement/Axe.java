package equipement;

public class Axe implements Weapon, BucklerDestroyer {

    public final int damage = 6;

    @Override
    public int getDamage() {
        return damage;
    }
}
