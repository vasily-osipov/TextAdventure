public class FindSwordArea extends LootArea{
    private boolean isSwordFound;
    public FindSwordArea(int x, int y, Sword sword){
        super(x,y, sword);
        this.isSwordFound = false;
    }
    public String intro_text(){
        if (isSwordFound){
            return "\nYou have returned to the area where the sword was located.\n";
        }else{
            return "\nYou have entered an area and see a shiny sword stuck into the ground in front of you.\n";
        }
    }
    public String findSword(){
        if(isSwordFound){
            return "\nYou have already picked up the sword.\n";
        }else{
            return "\nYou pick up the sword from the floor.\n";
        }
    }
}
