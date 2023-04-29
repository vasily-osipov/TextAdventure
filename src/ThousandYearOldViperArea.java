public class ThousandYearOldViperArea extends EnemyArea{
    private boolean isOldViperDefeated;
    public ThousandYearOldViperArea(int x, int y, ThousandYearOldViper oldViper){
        super(x, y, oldViper);
        this.isOldViperDefeated = false;
    }
    public String intro_text(){
        if (isOldViperDefeated){
            return "\nYou have returned to the area where the giant spider used to be.\n";
        }else{
            return "\nYou have entered an area with an ancient viper located right in the middle of it.\n";
        }
    }
    public boolean fightOldViper(Player the_player, ThousandYearOldViper oldViper){
        while(oldViper.isAlive()) {
            if (oldViper.isAlive()) {
                the_player.attackEnemy(oldViper);
            } else {
                isOldViperDefeated = true;
            }
            break;
        }
        if(isOldViperDefeated){
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