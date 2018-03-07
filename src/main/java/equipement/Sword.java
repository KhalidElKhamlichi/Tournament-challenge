package equipement;

public class Sword implements Weapon {

    public int damage = 5;

    @Override
    public int getDamage() {
        return damage;
    }
}
