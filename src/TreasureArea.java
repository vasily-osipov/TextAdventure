public class TreasureArea extends LootArea{
    private boolean isLooted;
    public TreasureArea(int x, int y, Gold gold){
        super(x, y, gold);
        this.isLooted = false;
    }
    public String intro_text(){
        if (isLooted){
            return "\nYou have returned to the room that used to contain treasure in it.\n";
        }else{
            return "\nYou have found a treasure room! There is a large chest with a lot of gold coins inside it in the middle of the room.\n";
        }
    }
    public String loot(){
        if(isLooted){
            return "\nYou have already obtained the treasure from this room.\n";
        }else{
            return "\nYou open up the chest and now all the gold is yours to take.\n";
        }
    }
}
