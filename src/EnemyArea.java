import java.sql.SQLOutput;
import java.util.ArrayList;

public class EnemyArea extends MapTile{
    protected Enemy enemy;
    public EnemyArea(int x, int y, Enemy enemy){
        super(x,y);
        this.enemy = enemy;
    }
    public void modify_player(Player the_player){
        if(enemy.isAlive()){
            the_player.hp = the_player.hp - enemy.damage;
            System.out.printf("\nEnemy does %d damage. You have %d HP remaining.\n", enemy.damage, the_player.hp);
        }
    }
    public ArrayList<Action> available_actions(){
        ArrayList<Action> moves = new ArrayList<Action>();
        moves = adjacent_moves();
        moves.add(new ViewInventory());
        if(enemy.isAlive()){
            moves.add(new Attack());
            moves.add(new Flee());
        }
        return moves;
    }
}
