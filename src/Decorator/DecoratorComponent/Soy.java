package Decorator.DecoratorComponent;

import Decorator.Component.Beverage;

/**
 * Soy topping for the beverage
 */
public class Soy extends CondimentDecorator{
    // reference for the Component to which soy will be added
    Beverage beverage;

    /**
     * Create Soy topping wrapping the main beverage.
     * @param beverage - condiment to be wrapped with soy.
     */
    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }

    /**
     * Topping will be added to beverage description.
     * @return - beverage description.
     */
    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Soy";
    }

    /**
     * Cost of topping will be added to main component.
     * @return - cost with a topping.
     */
    @Override
    public double cost() {
        return beverage.cost() + 0.15;
    }
}
