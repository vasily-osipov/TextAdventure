public class Ogre extends Enemy{
    private Colors color;
    public Ogre(String name, int hp, int damage, Colors color){
        super(name, hp, damage);
        this.color = color;
    }
    public String toStr1(){
        return String.format("%s\n=====\nHP: %d\nDamage: %d\nColor: %s\n", this.name, this.hp, this.damage, this.color);
    }
}
