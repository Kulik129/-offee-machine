package HomeWork6.CoffeeBuild;

public class MilkCoffe extends Coffee{
    private String milk;

    public MilkCoffe(String coffee, String sugar, String water, String milk) {
        super(coffee, sugar, water);
        this.milk = milk;
    }

    @Override
    public String toString() {
        return "Вкусный кофе с молоком" ;
    }

    public MilkCoffe(Coffee coffee, String milk) {
        super(coffee.getCoffee(), coffee.getSugar(), coffee.getWater());
        this.milk = milk;
    }
}
