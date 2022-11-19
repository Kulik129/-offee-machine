package HomeWork6.CoffeeBuild;

public class CappuccinoCoffee extends Coffee {
    private String cappuccino;

    public CappuccinoCoffee(String coffee, String sugar, String water, String cappuccino) {
        super(coffee, sugar, water);
        this.cappuccino = cappuccino;
    }

    @Override
    public String toString() {
        return "Ароматный Cappuccino";
    }

    public CappuccinoCoffee(Coffee coffee, String cappuccino) {
        super(coffee.getCoffee(), coffee.getSugar(), coffee.getWater());
        this.cappuccino = cappuccino;
    }
}
