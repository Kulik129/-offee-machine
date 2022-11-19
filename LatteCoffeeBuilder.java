package HomeWork6.CoffeeBuild;

public class LatteCoffeeBuilder extends CoffeeBuilder {
    private String latte;

    public void setLatte(String latte) {
        this.latte = latte;
    }

    public Coffee buildLatteCoffee() {
        System.out.println("Добавим больше молока");
        return new LatteCoffee(buildCoffee(), latte);
    }
}
