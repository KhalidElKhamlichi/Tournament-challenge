package equipement;

public class Equipement {

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
//        private boolean canBlockHitFrom(Weapon weapon) {
//            if (buckler != null) {
//                if(buckler.blockHitFrom(weapon))
//                    return true;
//            }
//            return false;
//        }
//        if (canBlockHitFrom(weapon)) return Integer.MAX_VALUE;
        if(armor != null) {
            return armor.damageResistance;
        }
        return 0;
    }

    public boolean canBlockHit() {
        if (buckler != null) {
            if(buckler.canBlockHit()) {
                buckler.resetConsecutiveHits();
                return true;
            }
        }
        return false;
    }

    public void blockHitFrom(Weapon weapon) {
        buckler.blockHitFrom(weapon);
    }

}
