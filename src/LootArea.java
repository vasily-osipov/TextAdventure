public class LootArea extends MapTile{
    Item item;
    public boolean pickedItem = false;
    public LootArea(int x, int y, Item item){
        super(x, y);
        this.item = item;
    }
    public void add_loot(Player player){
        player.inventory.add(item);
        pickedItem = true;
    }
    public void modify_player(Player player) {
        if(pickedItem == false){
            add_loot(player);
        }else{
            System.out.printf("\nThe item %s is already picked up.\n", item.name);
        }
    }
}
