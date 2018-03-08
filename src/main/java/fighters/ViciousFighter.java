package fighters;

public class ViciousFighter extends Fighter{

    protected Fighter decoratedFighter;
    private final int initialPoisonHits = 2;
    private final int poisonDamage = 20;
    private int remainingPoisonHits;

    public ViciousFighter(Fighter decoratedFighter) {
        this.decoratedFighter = decoratedFighter;
        remainingPoisonHits = initialPoisonHits;
    }

    @Override
    public int getDamageOutput() {
        if(remainingPoisonHits > 0) {
            remainingPoisonHits--;
            return super.getDamageOutput() + poisonDamage;
        }

        return super.getDamageOutput();

    }
}
