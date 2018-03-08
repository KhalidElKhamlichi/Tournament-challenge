package equipement;

public class Axe implements Weapon, BucklerDestroyer {

    private final int damage = 6;

    @Override
    public int getDamage() {
        return damage;
    }
}
