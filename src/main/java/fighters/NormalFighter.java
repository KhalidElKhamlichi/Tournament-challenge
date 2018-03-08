package fighters;

public class NormalFighter implements FighterState {

    private Fighter fighter;
    public NormalFighter(Fighter fighter) {
        this.fighter = fighter;
    }

    @Override
    public int getDamageOutput() {
        return fighter.calculateTotalDamageOutput();
    }
}
