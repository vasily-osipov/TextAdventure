public class StartingArea extends MapTile{
    public StartingArea(int x, int y){
        super(x,y);
    }
    public String intro_text(){
        return "\n You find yourself in a cave with a flickering torch on the wall.\n";
    }
    public void modify_player(Player player){

    }
}
