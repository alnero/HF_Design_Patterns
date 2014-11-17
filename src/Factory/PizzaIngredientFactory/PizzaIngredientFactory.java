package Factory.PizzaIngredientFactory;

import Factory.Ingredients.*;

/**
 * Interface for all the factories creating ingredients for pizzas
 */
public interface PizzaIngredientFactory {
    Dough createDough();
    Sauce createSauce();
    Cheese createCheese();
    Veggies[] createVeggies();
    Pepperoni createPepperoni();
    Clam createClam();
}
