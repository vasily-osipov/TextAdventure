public class Arrow extends Weapon{
    private String damage_modifier;
    public Arrow(String name, String description, int value, int damage, String damage_modifier){
        super(name, description, value, damage);
        this.damage_modifier = damage_modifier;
    }
    public String toStr6(){
        return String.format("%s\n=====\n%s\nValue: %d\nDamage: %d\nConverts damage dealt to %s damage.\n", this.name, this.description, this.value, this.damage, this.damage_modifier);
    }
}
