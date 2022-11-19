package HomeWork6.CoffeeBuild;

public class LatteCoffee extends Coffee {
    private String latte;

    public LatteCoffee(String coffee, String sugar, String water, String latte) {
        super(coffee, sugar, water);
        this.latte = latte;
    }

    @Override
    public String toString() {
        return "Нежный Latte";
    }

    public LatteCoffee(Coffee coffee, String latte) {
        super(coffee.getCoffee(), coffee.getSugar(), coffee.getWater());
        this.latte = latte;
    }
}
