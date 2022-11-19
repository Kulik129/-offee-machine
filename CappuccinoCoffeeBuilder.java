package HomeWork6.CoffeeBuild;

public class CappuccinoCoffeeBuilder extends CoffeeBuilder {
    private String cappuccino;

    public void setCappuccino(String cappuccino) {
        this.cappuccino = cappuccino;
    }

    public Coffee buildCappuccino() { // 40 ml espresso
        System.out.println("60 ml молока");
        return new CappuccinoCoffee(buildCoffee(), cappuccino);
    }


}
