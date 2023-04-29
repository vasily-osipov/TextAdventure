import java.util.function.DoubleFunction;

public class HostileMartialArtistArea extends EnemyArea{
    private boolean isMartialArtistDefeated;
    public HostileMartialArtistArea(int x, int y, HostileMartialArtist hostileMartialArtist){
        super(x, y, hostileMartialArtist);
        this.isMartialArtistDefeated = false;
    }
    public String intro_text(){
        if (isMartialArtistDefeated){
            return "\nYou have returned to the area where the hostile martial artist used to be.\n";
        }else{
            return "\nYou have entered an area with a hostile martial artist right in the middle of it. It looks like he is about to charge at you.\n";
        }
    }
    public boolean fightHostileMartialArtist(Player the_player, HostileMartialArtist hostileMartialArtist){
        while(hostileMartialArtist.isAlive()) {
            if (hostileMartialArtist.isAlive()) {
                the_player.attackEnemy(hostileMartialArtist);
            } else {
                isMartialArtistDefeated = true;
            }
            break;
        }
        if(isMartialArtistDefeated){
            return true;
        }else{
            return false;
        }
    }
    public void modify_player(Player player){
        if(enemy.isAlive()){
            player.hp = player.hp - enemy.damage;
            System.out.printf("\nThe enemy attacked you for %d damage. You have %d hp left. \n", enemy.damage, player.hp);
            player.attackEnemy(enemy);
        }
    }
}
