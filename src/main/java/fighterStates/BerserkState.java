package fighterStates;

import fighters.Fighter;

public class BerserkState implements FighterState {

    private final int damageMultiplier = 2;
    private Fighter fighter;

    public BerserkState(Fighter fighter) {
        this.fighter = fighter;
    }

    @Override
    public int getDamageOutput() {

        if(fighter.getHp() <= fighter.getInitialHp()*0.3)
            return fighter.calculateTotalDamageOutput() * damageMultiplier;

        return fighter.calculateTotalDamageOutput();
    }
}
