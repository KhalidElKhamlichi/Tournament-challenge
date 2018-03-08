package fighters;

import equipement.*;
import fighterStates.FighterState;
import fighterStates.NormalState;

public class Fighter {

    private FighterState state = new NormalState(this);

    private Equipment equipment = new Equipment();

    private int hp;
    private int initialHp;

    public Fighter equip(String equipmentPiece) {

        EquipmentPopulator.populate(equipment, equipmentPiece);
        return this;

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

    public void attack(Fighter fighter) {
        fighter.takeDamage(getDamageOutput(), equipment.weapon);
    }

    public void takeDamage(int damageValue, Weapon weapon) {
        if (damageValue <= 0)
            return;
        if(equipment.canBlockHit()) {
            equipment.blockHitFrom(weapon);
            return;
        }

        int damageToTake = damageValue - equipment.calculateTotalDamageResistance();
        damageToTake = Math.max(damageToTake, 0);
        hp -= damageToTake;
    }

    public int getDamageOutput() {
        return state.getDamageOutput();
    }

    public int calculateEquipmentDamageOutput() {
        return equipment.calculateTotalDamageOutput();
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

    public int getInitialHp() {
        return initialHp;
    }

    public void setState(FighterState state) {
        this.state = state;
    }
}
