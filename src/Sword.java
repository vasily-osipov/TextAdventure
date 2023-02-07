public class Sword extends Weapon{
    private int magic_conductivity;
    public Sword(String name, String description, int value, int damage, int magic_conductivity){
        super(name, description, value, damage);
        this.magic_conductivity = magic_conductivity;
    }
    public String toStr3(){
        return String.format("%s\n=====\n%s\nValue: %d\nDamage: %d\nMagic conductivity: %d percent.\n", this.name, this.description, this.value, this.damage, this.magic_conductivity);
    }

}
