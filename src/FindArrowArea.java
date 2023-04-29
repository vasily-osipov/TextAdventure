public class FindArrowArea extends LootArea{
    private boolean isArrowFound;
    public FindArrowArea(int x, int y, Arrow arrow){
        super(x,y, arrow);
        this.isArrowFound = false;
    }
    public String intro_text(){
        if (isArrowFound){
            return "\nYou have returned to the area where the arrow was located.\n";
        }else{
            return "\nYou have entered an area and see an arrow stuck into a nearby tree.\n";
        }
    }
    public String findArrow(){
        if(isArrowFound){
            return "\nYou have already picked up the arrow.\n";
        }else{
            return "\nYou take out the arrow from the tree.\n";
        }
    }
}