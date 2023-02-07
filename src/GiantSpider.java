public class GiantSpider extends Enemy{
    private int poison_duration;
    public GiantSpider(String name, int hp, int damage, int poison_duration){
        super(name, hp, damage);
        this.poison_duration = poison_duration;
    }
    public String toStr4(){
        return String.format("%s\n=====\nHP: %d\nDamage: %d\nPoison duration: %d seconds.\n", this.name, this.hp, this.damage, this.poison_duration);
    }
}
