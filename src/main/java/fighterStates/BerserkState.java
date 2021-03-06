package fighterStates;

import fighters.Fighter;

public class BerserkState implements FighterState {

    private final int damageMultiplier = 2;
    private Fighter fighter;
    private double triggerValue = 0.3;

    public BerserkState(Fighter fighter) {
        this.fighter = fighter;
    }

    @Override
    public int getDamageOutput() {

        if(fighter.getHp() <= fighter.getInitialHp()* triggerValue)
            return fighter.calculateEquipmentDamageOutput() * damageMultiplier;

        return fighter.calculateEquipmentDamageOutput();
    }
}
