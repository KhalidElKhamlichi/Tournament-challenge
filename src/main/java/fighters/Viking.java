package fighters;

public class Viking extends Fighter {

    private final int hp = 120;

    public Viking() {
        super.setHp(hp);
        equip("axe");
    }

    public int hitPoints() {
        return super.getHp();
    }


    public Viking equip(String equipmentPiece) {
        super.equip(equipmentPiece);
        return this;
    }

}
