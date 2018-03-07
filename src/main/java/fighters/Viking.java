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


    public Viking equip(String equipementPiece) {
        super.equip(equipementPiece);
        return this;
    }

    @Override
    public void attack(Fighter fighter) {

        super.attack(fighter);
    }
}
