public class Weapon extends Item{
    protected int damage;
    public Weapon(String name, String description, int value, int damage){
        super(name, description, value);
        this.damage = damage;
    }
    public String toStr2(){
        return String.format("%s\n=====\n%s\nValue: %d\nDamage: %d\n", this.name, this.description, this.value, this.damage);
    }
}
