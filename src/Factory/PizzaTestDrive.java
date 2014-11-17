package Factory;

import Factory.Pizza.Pizza;
import Factory.PizzaStores.CaliforniaPizzaStore;
import Factory.PizzaStores.ChicagoPizzaStore;
import Factory.PizzaStores.NYPizzaStore;
import Factory.PizzaStores.PizzaStore;

/**
 * Let's make some ordering
 */
public class PizzaTestDrive {
    public static void main(String[] args) {
        PizzaStore nyStore = new NYPizzaStore();
        PizzaStore chicagoStore = new ChicagoPizzaStore();
        PizzaStore californiaStore = new CaliforniaPizzaStore();

        Pizza nyCheese = nyStore.orderPizza("cheese");
        System.out.println(nyCheese);

        Pizza chicagoCheese = chicagoStore.orderPizza("cheese");
        System.out.println(chicagoCheese);

        Pizza californiaVeggie = californiaStore.orderPizza("veggie");
        System.out.println(californiaVeggie);
    }
}
