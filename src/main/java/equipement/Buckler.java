package equipement;

public class Buckler {

    private int durability = 3;

    private final int maxConsecutiveHits = 1;

    private int consecutiveHits = 0;

    public boolean canBlockHit() {
        if (durability > 0 && consecutiveHits < maxConsecutiveHits) {
            return true;
        }
        consecutiveHits = 0;
        return false;
    }

    public void blockHitFrom(Weapon weapon) {

        consecutiveHits++;
        if (weapon instanceof BucklerDestroyer) {
            durability--;
        }

    }
}
