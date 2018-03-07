package equipement;

public class Buckler {

    private int durability = 3;

    private final int maxConsecutiveHits = 1;

    private int consecutiveHits = 0;

    public boolean canBlockHit() {
        return durability > 0 && consecutiveHits < maxConsecutiveHits;
    }

    public void blockHitFrom(Weapon weapon) {
        //if(canBlockHit()) {
            consecutiveHits++;
            if (weapon instanceof BucklerDestroyer) {
                durability--;
            }
            //return true;
        //}

//        consecutiveHits = 0;
        //return false;
    }

    public void resetConsecutiveHits() {
        consecutiveHits = 0;
    }


}
