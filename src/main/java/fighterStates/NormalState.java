package fighterStates;


import fighters.Fighter;

public class NormalState implements FighterState {

    private Fighter fighter;

    public NormalState(Fighter fighter) {
        this.fighter = fighter;
    }

    @Override
    public int getDamageOutput() {
        return fighter.calculateTotalDamageOutput();
    }
}
