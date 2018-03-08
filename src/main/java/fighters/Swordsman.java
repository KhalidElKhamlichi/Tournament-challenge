package fighters;

import fighterStates.ViciousState;

public class Swordsman extends Fighter {

    private final int hp = 100;

    public Swordsman() {
        super.setHp(hp);
        equip("sword");
    }

    public Swordsman(String input) {
        this();
        super.setState(new ViciousState(this));
    }

    public int hitPoints() {
        return super.getHp();
    }

    public Swordsman equip(String equipmentPiece) {
        super.equip(equipmentPiece);
        return this;
    }
}
