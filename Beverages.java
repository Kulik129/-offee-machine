package HomeWork6.CoffeeBuild;

public class Beverages {
    public void CoffeeWithMilkPlease() {
        CoffeeBuilder cb = new MilkCoffeeBuilder();
        cb.setCoffee("Кофе");
        cb.setWater("200 грамм воды");
        cb.setSugar("3 ложки");
        cb.boilingWater(); // Вода вкипячена

        ((MilkCoffeeBuilder)cb).setMilk("100 ml milk");
        Coffee c = ((MilkCoffeeBuilder)cb).buildMilkCoffee();
        System.out.println(c);
    }

    public void espressoPlease() {
        CoffeeBuilder eb = new EspressoCoffeeBuilder();
        eb.setCoffee("Кофе");
        eb.setWater("40 ml");
        eb.setSugar("?");

        ((EspressoCoffeeBuilder)eb).setEspresso("40 ml Espresso");
        Coffee e = ((EspressoCoffeeBuilder)eb).buildEspresso();
        System.out.println(e);
    }

    public void CappuccinoPlease() {
        CoffeeBuilder ca = new CappuccinoCoffeeBuilder();
        ca.setCoffee("Кофе");
        ca.setWater("100 грамм воды");
        ca.setSugar("3 ложки");
        espressoPlease();
        ((CappuccinoCoffeeBuilder)ca).setCappuccino("100 ml milk");
        Coffee cc = ((CappuccinoCoffeeBuilder)ca).buildCappuccino();
        ca.boilingMilk();
        System.out.println(cc);
    }

    public void lattePlease() {
        CoffeeBuilder la = new LatteCoffeeBuilder();
        la.setCoffee("Кофе");
        la.setWater("100 грамм воды");
        la.setSugar("3 ложки");
        espressoPlease();
        ((LatteCoffeeBuilder)la).setLatte("100 ml milk");
        Coffee ll = ((LatteCoffeeBuilder)la).buildLatteCoffee();
        la.boilingMilk();
        System.out.println(ll);
    }

    public void lattePleasse(){
        CoffeeBuilder la = new LatteCoffeeBuilder();
        la.setCoffee("Кофе");
        la.setWater("100 грамм молока");
        la.setSugar("3 ложки");

        espressoPlease();

        ((LatteCoffeeBuilder)la).setLatte("");
        Coffee ll = ((LatteCoffeeBuilder)la).buildLatteCoffee();

        System.out.println(ll);
    }
}
