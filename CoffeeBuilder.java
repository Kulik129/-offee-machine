package HomeWork6.CoffeeBuild;

public class CoffeeBuilder { // Шаблон строитель (builder)
    // делаем инструкцию


    private Coffee coffee;
    private String water;
    private String sugar;
    private String typeCoffee;

    public  void  boilingWater() {
        System.out.println("Вода вкипячена");
    }

    public Coffee buildCoffee(){
        // возьми чашку
        // насыпь кофе
        // добавь сахар
        // залей водой
        // перемешай
        return new Coffee(typeCoffee, water,sugar);
    }

    public void setCoffee(String typeCoffee) {
        this.typeCoffee = typeCoffee;
    }

    public void setWater(String water) {
        this.water = water;
    }

    public void setSugar(String sugar) {
        this.sugar = sugar;
    }

    public  void  boilingMilk() {
        System.out.println("Молоко вкипячено");
    }
}
