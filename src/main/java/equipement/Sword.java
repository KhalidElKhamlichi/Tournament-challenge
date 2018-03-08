package equipement;

public class Sword implements Weapon {

    private int damage = 5;

    @Override
    public int getDamage() {
        return damage;
    }
}
