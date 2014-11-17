package Factory.PizzaStores;

import Factory.Pizza.*;
import Factory.PizzaIngredientFactory.CaliforniaPizzaIngredientFactory;
import Factory.PizzaIngredientFactory.PizzaIngredientFactory;

/**
* Californian pizza store
*/
public class CaliforniaPizzaStore extends PizzaStore {

    @Override
    Pizza createPizza(String typeOfPizza) {
        Pizza pizza = null;
        PizzaIngredientFactory ingredientFactory = new CaliforniaPizzaIngredientFactory();

        if("cheese".equals(typeOfPizza)){
            pizza = new CheesePizza(ingredientFactory);
            pizza.setName("California Cheese Pizza");

        } else if("pepperoni".equals(typeOfPizza)){
            pizza = new PepperoniPizza(ingredientFactory);
            pizza.setName("California Pepperoni Pizza");

        } else if ("clam".equals(typeOfPizza)){
            pizza = new ClamPizza(ingredientFactory);
            pizza.setName("California Clam Pizza");

        } else if ("veggie".equals(typeOfPizza)){
            pizza = new VeggiePizza(ingredientFactory);
            pizza.setName("California Veggie Pizza");
        }
        return pizza;
    }
}
