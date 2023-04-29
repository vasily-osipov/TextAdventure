public class EmptyPath extends MapTile{
    public EmptyPath(int x, int y){
        super(x, y);
    }
    public String intro_text(){
        return "\nYou are on a path that leads further into the distance.\n";
    }
    public void modify_player(Player player) {

    }
}
