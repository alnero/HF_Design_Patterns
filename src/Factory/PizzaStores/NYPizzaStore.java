package Factory.PizzaStores;

import Factory.Pizza.*;
import Factory.PizzaIngredientFactory.NYPizzaIngredientFactory;
import Factory.PizzaIngredientFactory.PizzaIngredientFactory;

/**
 * Pizza Store with NY flavour
 */
public class NYPizzaStore extends PizzaStore{

    @Override
    Pizza createPizza(String typeOfPizza) {
        Pizza pizza = null;
        PizzaIngredientFactory nyIngredientFactory = new NYPizzaIngredientFactory();

        if("cheese".equals(typeOfPizza)){
            pizza = new CheesePizza(nyIngredientFactory);
            pizza.setName("NY Cheese Pizza");

        } else if("pepperoni".equals(typeOfPizza)){
            pizza = new PepperoniPizza(nyIngredientFactory);
            pizza.setName("NY Pepperoni Pizza");

        } else if ("clam".equals(typeOfPizza)){
            pizza = new ClamPizza(nyIngredientFactory);
            pizza.setName("NY Pepperoni Pizza");

        } else if ("veggie".equals(typeOfPizza)){
            pizza = new VeggiePizza(nyIngredientFactory);
            pizza.setName("NY Veggie Pizza");
        }
        return pizza;
    }
}
