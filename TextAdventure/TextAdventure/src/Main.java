public class Main {
    public static void main(String[] args) {
        Gold goldCoin = new Gold(1, 100);
        System.out.println(goldCoin.toStr());

        Gold goldBar = new Gold("Gold bar", 1, 10);
        System.out.println(goldBar.toStr());

        Sword magicSword = new Sword("Grandmaster's Sword", "A well-made sword that was once used by an ancient swordmaster that helped end the 1000-year war that plagued the continent.", 1000, 500, 95);
        System.out.println(magicSword.toStr3());

        Pillow softPillow = new Pillow("The Pillow of Sleep", "A professionally made pillow that was made by a famous pillow-making company.", 25, 0, 9);
        System.out.println(softPillow.toStr4());

        Mace bigMace = new Mace("The Mace of Destruction", "A large mace made of extremely durable metal with large armor-crushing spikes on it.", 750, 400, 50);
        System.out.println(bigMace.toStr5());

        Arrow fireArrow = new Arrow("Hellfire Arrow", "An ancient arrow forged from the ore that can only be found in the deepest depths of hell.", 100, 250, "fire");
        System.out.println(fireArrow.toStr6());

        Ogre greenOgre = new Ogre("Ancient Green Ogre", 2000, 500, "Green");
        System.out.println(greenOgre.toStr1());

        Ogre redOgre = new Ogre("Mythical Berserk Red Ogre", 50000, 1000, "Red");
        System.out.println(redOgre.toStr1());

        Zombie slowZombie = new Zombie("Peak Expert Level Zombie", 250, 350, 50);
        System.out.println(slowZombie.toStr2());

        Zombie fastZombie = new Zombie("Swordmaster Level Zombie", 500, 750, 200);
        System.out.println(fastZombie.toStr2());

        Dog spotDog = new Dog("Medium-sized Spotted Dog", 50, 100, 75, 34);
        System.out.println(spotDog.toStr3());

        GiantSpider ancientSpider = new GiantSpider("1000-Year-Old Cave Spider", 5000, 175, 180);
        System.out.println(ancientSpider.toStr4());

        Dragon waterDragon = new Dragon("5000-Year-Old All-Seeing Water Dragon", 1000000, 250000, "water");
        System.out.println(waterDragon.toStr5());
    }
}