package fighters;

import equipement.*;

public class Fighter {

    private Equipement equipement = new Equipement();
    private int hp;

    public Fighter equip(String equipementPiece) {
        if(equipementPiece.equals("armor")) {
            equipement.armor = new Armor();
            return this;
        }

        if(equipementPiece.equals("buckler")) {
            equipement.buckler = new Buckler();
            return this;
        }

        equipement.weapon = WeaponFactory.getWeapon(equipementPiece);
        return this;
    }

    public void takeDamage(int damageValue, Weapon weapon) {
        if (damageValue <= 0)
            return;

        if(equipement.canBlockHit()) {
            equipement.blockHitFrom(weapon);
            return;
        }

        int damageToTake = damageValue - equipement.calculateTotalDamageResistance();
        damageToTake = Math.max(damageToTake, 0);
        System.out.println("damage taken "+damageToTake);
        hp -= damageToTake;
    }

    public int getDamageOutput() {
        //System.out.println("dmg output "+equipement.calculateTotalDamageOutput());
        return equipement.calculateTotalDamageOutput();
    }

    public boolean isDead() {
        return hp <= 0;
    }

    public void setHp(int hp) {
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

}
