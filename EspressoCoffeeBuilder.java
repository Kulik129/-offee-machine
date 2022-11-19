package HomeWork6.CoffeeBuild;

public class EspressoCoffeeBuilder extends CoffeeBuilder {
    private String espresso;

    public void setEspresso(String espresso) {
        this.espresso = espresso;
    }

    public Coffee buildEspresso() { // 40 ml espresso
        System.out.println("40 ml espresso");
        return new EspressoCoffee(buildCoffee(), espresso);
    }


}
