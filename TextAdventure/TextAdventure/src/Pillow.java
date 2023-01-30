public class Pillow extends Weapon{
    private int softness;
    public Pillow(String name, String description, int value, int damage, int softness){
        super(name, description, value, damage);
        this.softness = softness;
    }
    public String toStr4() {
        return String.format("%s\n=====\n%s\nValue: %d\nDamage: %d\nSoftness(1-10): %d\n", this.name, this.description, this.value, this.damage, this.softness);
    }
}
