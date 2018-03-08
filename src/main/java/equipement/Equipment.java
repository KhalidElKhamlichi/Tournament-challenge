package equipement;

public class Equipment {

    public Weapon weapon;
    public Armor armor;
    public Buckler buckler;

    public int calculateTotalDamageOutput() {
        int totalDmg = weapon.getDamage();
        if(armor != null)
             totalDmg -= armor.damageReduction;

        return totalDmg;
    }

    public int calculateTotalDamageResistance() {

        if(armor != null) {
            return armor.damageResistance;
        }
        return 0;
    }

    public boolean canBlockHit() {
        if(buckler == null)
            return false;
        return buckler.canBlockHit();
    }

    public void blockHitFrom(Weapon weapon) {
        buckler.blockHitFrom(weapon);
    }

}
