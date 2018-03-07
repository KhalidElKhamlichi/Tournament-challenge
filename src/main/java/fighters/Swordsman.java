package fighters;

public class Swordsman extends Fighter {

    private final int hp = 100;

    public Swordsman() {
        super.setHp(hp);
        equip("sword");
    }

    public int hitPoints() {
        return super.getHp();
    }

    public Swordsman equip(String equipementPiece) {
        super.equip(equipementPiece);
        return this;
    }
}
