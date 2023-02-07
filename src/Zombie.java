public class Zombie extends Enemy{
    private int speed;
    public Zombie(String name, int hp, int damage, int speed){
        super(name, hp, damage);
        this.speed = speed;
    }
    public String toStr2(){
        return String.format("%s\n=====\nHP: %d\nDamage: %d\nSpeed: %d\n", this.name, this.hp, this.damage, this.speed);
    }
}
