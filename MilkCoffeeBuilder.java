package HomeWork6.CoffeeBuild;

public class MilkCoffeeBuilder extends CoffeeBuilder{
    private String milk;

    public void setMilk(String milk) {
        this.milk = milk;
    }

    public Coffee buildMilkCoffee() {
        System.out.println("Добавим молока");
        return new MilkCoffe(buildCoffee(), milk);
    }
}
