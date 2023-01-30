public class Mace extends Weapon{
    private int armor_shred;
    public Mace(String name, String description, int value, int damage, int armor_shred){
        super(name, description, value, damage);
        this.armor_shred = armor_shred;
    }
    public String toStr5(){
        return String.format("%s\n=====\n%s\nValue: %d\nDamage: %d\nArmor Shred: %d percent.\n", this.name, this.description, this.value, this.damage, this.armor_shred);
    }
}
