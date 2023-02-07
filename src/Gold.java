public class Gold extends Item{
    private int amount;
    public Gold(int value, int amount) {
        super("Gold coin", String.format("A round coin with %s stamped on the front.", value), value);
        this.amount = amount;
    }
    public Gold(String name, int weight, int amount){
        super(name, String.format("A bar of solid gold with %s stamped on top of it that signifies its weighs about %s kilogram.", weight, weight), weight*50);
        this.amount = amount;
    }
    public String toStr(){
        return String.format("%s\n=====\n%s\nValue: %d\nAmount: %d\n", this.name, this.description, this.value, this.amount);
    }
}
