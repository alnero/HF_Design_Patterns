package Factory.PizzaIngredientFactory;

import Factory.Ingredients.*;

/**
 * Ingredients factory for the Californians
 */
public class CaliforniaPizzaIngredientFactory implements PizzaIngredientFactory {
    @Override
    public Dough createDough() {
        return new MediumCrustDough();
    }

    @Override
    public Sauce createSauce() {
        return new ThousandIslandsSauce();
    }

    @Override
    public Cheese createCheese() {
        return new Parmezan();
    }

    @Override
    public Veggies[] createVeggies() {
        Veggies[] veggies = {new Onion(), new Garlic(), new Mushroom(), new RedPepper()};
        return veggies;
    }

    @Override
    public Pepperoni createPepperoni() {
        return new SlicedPepperoni();
    }

    @Override
    public Clam createClam() {
        return new RoastedClam();
    }
}
