package equipement;

public class GreatSword implements Weapon {

    private final int damage = 12;

    private final int maxConsecutiveHits = 2;

    private int consecutiveHits = 0;

    private boolean canHit() {
        return consecutiveHits < maxConsecutiveHits;
    }

    @Override
    public int getDamage() {
        if(canHit()) {
            consecutiveHits++;
            return damage;
        }

        consecutiveHits = 0;
        return 0;
    }
}
