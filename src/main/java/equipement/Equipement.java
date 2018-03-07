package equipement;

public class Equipement {

    public Weapon weapon;
    public Armor armor;
    public Buckler buckler;

    public int calculateTotalDamageOutput() {
        int totalDmg = weapon.getDamage();
        if(armor != null)
             totalDmg -= armor.damageReduction;
        System.out.println("weapon dmg "+totalDmg);

        return totalDmg;
    }

    public int calculateTotalDamageResistanceTo(Weapon weapon) {

        if (buckler != null) {
            if(buckler.blockHitFrom(weapon))
                return Integer.MAX_VALUE;
        }
        if(armor != null) {
            return armor.damageResistance;
        }
        return 0;
    }

}
