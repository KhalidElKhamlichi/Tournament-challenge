package fighters;

import equipement.*;

public class Fighter {

    private FighterState state = new NormalFighter(this);

    private Equipement equipement = new Equipement();
    private int hp;

    private int initialHp;

    public Fighter equip(String equipementPiece) {

        if(equipementPiece.equals("armor")) {
            equipement.armor = EquipementFactory.getArmor();
            return this;
        }

        if(equipementPiece.equals("buckler")) {
            equipement.buckler = EquipementFactory.getBuckler();
            return this;
        }

        equipement.weapon = EquipementFactory.getWeapon(equipementPiece);
        return this;
    }

    public void takeDamage(int damageValue, Weapon weapon) {
        if (damageValue <= 0)
            return;

        int damageToTake = damageValue - equipement.calculateTotalDamageResistanceTo(weapon);
        damageToTake = Math.max(damageToTake, 0);
        System.out.println("damage taken "+damageToTake);
        hp -= damageToTake;
        System.out.println("current health "+hp);
    }

    public int getDamageOutput() {
        //System.out.println("dmg output "+equipement.calculateTotalDamageOutput());
        int dmg = state.getDamageOutput();
//        System.out.println("dmg output "+dmg);
        return dmg;
    }

    public int calculateTotalDamageOutput() {
        return equipement.calculateTotalDamageOutput();
    }

    public boolean isDead() {
        return hp <= 0;
    }

    public void setHp(int hp) {
        this.initialHp = hp;
        this.hp = hp;
    }

    public int getHp() {
        return Math.max(hp, 0);
    }

    public void attack(Fighter fighter) {
        fighter.takeDamage(getDamageOutput(), equipement.weapon);
    }

    public void engage(Fighter fighter) {
        while (true) {
            this.attack(fighter);
            if (fighter.isDead())
                break;

            fighter.attack(this);
            if (this.isDead())
                break;
        }
    }

    public void setState(FighterState state) {
        this.state = state;
    }

    public int getInitialHp() {
        return initialHp;
    }
}
