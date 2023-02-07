public class Dragon extends Enemy{
    private ElementalAttributes elemental_attribute;
    public Dragon(String name, int hp, int damage, ElementalAttributes elemental_attribute){
        super(name, hp, damage);
        this.elemental_attribute = elemental_attribute;
    }
    public String toStr5(){
        return String.format("%s\n=====\nHP: %d\nDamage: %d\nCan use every single %s type skill in existence.\n", this.name, this.hp, this.damage, this.elemental_attribute);
    }
}
