public class HostileMartialArtist extends Enemy{
    private Affiliations affiliation;
    public HostileMartialArtist(String name, int hp, int damage, Affiliations affiliation){
        super(name, hp, damage);
        this.affiliation = affiliation;
    }
    public String toStr1(){
        return String.format("%s\n=====\nHP: %d\nDamage: %d\nColor: %s\n", this.name, this.hp, this.damage, this.affiliation);
    }
}
