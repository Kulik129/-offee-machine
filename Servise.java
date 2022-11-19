package HomeWork6.CoffeeBuild;
import java.util.Scanner;
public class Servise {
    public void printCoffee() {

        Scanner iScanner = new Scanner(System.in);
        System.out.println("У нас есть:\nэспрессо\n" +
                "молочный кофе\nкапучино\nлатте\n\nВведите имя напитка\n");
        String a = iScanner.next();
        switch (a){
            case "эспрессо":
                Beverages espressoCoffee = new Beverages();
                espressoCoffee.espressoPlease();
                break;
            case "молочный кофе":
                Beverages coffeeMilk = new Beverages();
                coffeeMilk.CoffeeWithMilkPlease();
                break;
            case "капучино":
                Beverages cappuccino = new Beverages();
                cappuccino.CappuccinoPlease();
                break;
            case "латте":
                Beverages latte = new Beverages();
                latte.lattePleasse();
                break;
        }
        iScanner.close();
    }
}