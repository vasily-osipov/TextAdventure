public class AscendToCelestialRealmArea extends MapTile{
    public AscendToCelestialRealmArea(int x, int y){
        super(x, y);
    }
    public String intro_text(){
        return "\nAs you enter the next new area, you start to feel enlightened. " +
                "Suddenly, you start emanating a bright light all around you. " +
                "As your spirit leaves your body, you realize that you are finally ascending to the celestial realm!";
    }
    public boolean canLeave(){
        return true;
    }
    public void modify_player(Player player) {
        player.victory = true;
    }
}
