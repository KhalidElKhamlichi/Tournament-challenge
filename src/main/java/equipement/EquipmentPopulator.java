package equipement;

public class EquipmentPopulator {

    public static Equipment populate(Equipment equipment, String equipmentPiece) {
        if(equipmentPiece.equals("armor")) {
            equipment.armor = new Armor();
            return equipment;
        }

        if(equipmentPiece.equals("buckler")) {
            equipment.buckler = new Buckler();
            return equipment;
        }

        equipment.weapon = WeaponFactory.getWeapon(equipmentPiece);
        return equipment;
    }
}
