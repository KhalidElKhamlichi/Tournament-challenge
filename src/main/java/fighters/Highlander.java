package fighters;

import fighterStates.BerserkState;

public class Highlander extends Fighter {

    private final int hp = 150;

    public Highlander() {
        super.setHp(hp);
        equip("great sword");
    }

    public Highlander(String veteran) {
        this();
        super.setState(new BerserkState(this));
    }
    public Highlander equip(String equipmentPiece) {
        super.equip(equipmentPiece);
        return this;
    }

    public int hitPoints() {
        return super.getHp();
    }
}
