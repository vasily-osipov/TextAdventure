import java.awt.Point;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class World {
    public static String[][] _world;
    static Point Starting_Position = new Point(0,0);
    public static ArrayList<MapTile> history = new ArrayList<MapTile>();

    public void load_tiles(){
        List<String> rows = new ArrayList<String>();
        try{
            BufferedReader f = new BufferedReader(new FileReader("src/map.txt"));
            String row;
            while ((row = f.readLine()) != null){
                rows.add(row);
            }
            f.close();
            int x_max = rows.get(0).split("\t").length;
            _world = new String[rows.size()][x_max];
            String[] cols;
            String tile_name;
            for(int y = 0; y < rows.size(); y++){
                cols = rows.get(y).split("\t");
                for(int x = 0; x < x_max; x++){
                    tile_name = cols[x];
                    if(tile_name.equals("StartingArea")){
                        Starting_Position.x = y;
                        Starting_Position.y = x;
                    }
                    _world[y][x] = tile_name.equals(" ") ? null : tile_name;
                }
            }
        }
        catch (Exception e) {
            //System.err.format("Exception occurred trying to read '%s'.", filename);
            e.printStackTrace();
        }
    }

    public static MapTile tile_exists(int x, int y){
        MapTile mt = null;
        if( (x >= 0 && x < _world.length) && (y >= 0 && y < _world[0].length) && (_world[x][y] != null) ) {
            switch (_world[x][y]) {
                case "StartingArea":
                    mt = new StartingArea(x, y);
                    mt = checkAreaExists(mt);
                    break;
                case "FindSwordArea":
                    mt = new FindSwordArea(x, y, new Sword("Iron Sword", "A well-made iron sword.", 25, 20, 10));
                    mt = checkAreaExists(mt);
                    break;
                case "ThousandYearOldViperArea":
                    mt = new ThousandYearOldViperArea(x, y, new ThousandYearOldViper("Ancient Poisonous Viper", 50,5,10));
                    mt = checkAreaExists(mt);
                    break;
                case "TreasureArea":
                    mt = new TreasureArea(x, y, new Gold(10,5));
                    mt = checkAreaExists(mt);
                    break;
                case "EmptyPath":
                    mt = new EmptyPath(x, y);
                    break;
                case "FindArrowArea":
                    mt = new FindArrowArea(x, y, new Arrow("Arrow", "A well-made arrow with an iron arrowhead.", 7, 10, "physical"));
                    mt = checkAreaExists(mt);
                    break;
                case "HostileMartialArtistArea":
                    mt = new HostileMartialArtistArea(x, y, new HostileMartialArtist("Enraged Martial Artist", 100,20, Affiliations.Mount_Hua_Sect));
                    mt = checkAreaExists(mt);
                    break;
                case "AscendToCelestialRealmArea":
                    mt = new AscendToCelestialRealmArea(x, y);
                    break;
            }
        }
        return mt;

    }
    private static MapTile checkAreaExists(MapTile mt) {
        if (history.indexOf(mt) != -1) {
            mt = history.get(history.indexOf(mt));
        } else {
            history.add(mt);
        }
        return mt;
    }
}
