package HomeWork6.CoffeeBuild;

public class EspressoCoffee extends Coffee {
    private String espresso;


    public EspressoCoffee(String coffee, String sugar, String water, String espresso) {
        super(coffee, sugar, water);
        this.espresso = espresso;
    }

    @Override
    public String toString() {
        return "Ароматный Espresso";
    }

    public EspressoCoffee(Coffee coffee, String espresso) {
        super(coffee.getCoffee(), coffee.getSugar(), coffee.getWater());
        this.espresso = espresso;
    }
}
