package fighters;

public class Highlander extends Fighter {

    private final int hp = 150;

    public Highlander() {
        super.setHp(hp);
        equip("great sword");
    }

    public Highlander(String veteran) {

    }
    public Highlander equip(String equipementPiece) {
        super.equip(equipementPiece);
        return this;
    }

    public int hitPoints() {
        return super.getHp();
    }
}
