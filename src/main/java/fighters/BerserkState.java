package fighters;

public class BerserkState implements FighterState {

    private final int damageMultiplier = 2;
    private Fighter fighter;

    public BerserkState(Fighter fighter) {
        this.fighter = fighter;
    }

    @Override
    public int getDamageOutput() {
        System.out.println("BERSERK !! "+fighter.getHp() +" "+ fighter.getInitialHp()*0.3);

        if(fighter.getHp() <= fighter.getInitialHp()*0.3)
            return fighter.calculateTotalDamageOutput() * damageMultiplier;


        return fighter.calculateTotalDamageOutput();
    }
}
