package Factory.PizzaStores;

import Factory.Pizza.*;
import Factory.PizzaIngredientFactory.ChicagoPizzaIngredientFactory;
import Factory.PizzaIngredientFactory.PizzaIngredientFactory;

/**
 * Pizza store in Chicago
 */
public class ChicagoPizzaStore extends PizzaStore{
    @Override
    Pizza createPizza(String typeOfPizza) {
        Pizza pizza = null;
        PizzaIngredientFactory ingredientFactory = new ChicagoPizzaIngredientFactory();

        if("cheese".equals(typeOfPizza)){
            pizza = new CheesePizza(ingredientFactory);
            pizza.setName("Chicago Cheese Pizza");

        } else if("pepperoni".equals(typeOfPizza)){
            pizza = new PepperoniPizza(ingredientFactory);
            pizza.setName("Chicago Pepperoni Pizza");

        } else if ("clam".equals(typeOfPizza)){
            pizza = new ClamPizza(ingredientFactory);
            pizza.setName("Chicago Clam Pizza");

        } else if ("veggie".equals(typeOfPizza)){
            pizza = new VeggiePizza(ingredientFactory);
            pizza.setName("Chicago Veggie Pizza");
        }
        return pizza;
    }
}
