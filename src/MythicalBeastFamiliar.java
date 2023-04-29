public class MythicalBeastFamiliar extends Enemy{
    private int taming_progress;
    private int affection_level;
    public MythicalBeastFamiliar(String name, int hp, int damage, int taming_progress, int affection_level){
        super(name, hp, damage);
        this.taming_progress = taming_progress;
        this.affection_level = affection_level;
    }
    public String toStr3(){
        return String.format("%s\n=====\nHP: %d\nDamage: %d\nTaming progress: %d percent.\nAffection level: %d percent.\n", this.name, this.hp, this.damage, this.taming_progress, this.affection_level);
    }
}
