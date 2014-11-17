package Decorator.DecoratorComponent;

import Decorator.Component.Beverage;

/**
 * Mocha topping for the beverage
 */
public class Mocha extends CondimentDecorator{
    // reference for the Component to which mocha will be added
    Beverage beverage;

    /**
     * Create Mocha topping wrapping the main beverage.
     * @param beverage - condiment to be wrapped with mocha.
     */
    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    /**
     * Topping will be added to beverage description.
     * @return - beverage description.
     */
    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Mocha";
    }

    /**
     * Cost of topping will be added to main component.
     * @return - cost with a topping.
     */
    @Override
    public double cost() {
        return beverage.cost() + 0.20;
    }
}
