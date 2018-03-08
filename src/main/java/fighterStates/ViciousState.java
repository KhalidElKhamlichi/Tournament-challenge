package fighterStates;

import fighters.Fighter;

public class ViciousState implements FighterState {

    private Fighter fighter;
    private final int initialPoisonHits = 2;
    private final int poisonDamage = 20;
    private int remainingPoisonHits;

    public ViciousState(Fighter fighter) {
        this.fighter = fighter;
        remainingPoisonHits = initialPoisonHits;
    }

    public int getDamageOutput() {
        if(remainingPoisonHits > 0) {
            remainingPoisonHits--;
            return fighter.calculateTotalDamageOutput() + poisonDamage;
        }

        return fighter.calculateTotalDamageOutput();

    }
}
