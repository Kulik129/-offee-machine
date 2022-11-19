package HomeWork6.CoffeeBuild;

public class CoffeeBrew implements Brew{
    @Override
    public void addSugar() {

    }

    @Override
    public void addWater() {

    }

    @Override
    public void addCoffee() {

    }

    @Override
    public void addTea() {

        throw new IllegalStateException("неподдерживаемый метод");
    }
}
