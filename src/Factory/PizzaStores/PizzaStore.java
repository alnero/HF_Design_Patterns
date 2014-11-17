package Factory.PizzaStores;

import Factory.Pizza.Pizza;

/**
 * Framework for Pizza Stores, all stuff to get and sell pizzas
 */
public abstract class PizzaStore {

    public final Pizza orderPizza(String typeOfPizza){
        Pizza pizza = createPizza(typeOfPizza);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }

    abstract Pizza createPizza(String typeOfPizza);
}
