package Decorator.DecoratorComponent;

import Decorator.Component.Beverage;

/**
 * Milk topping for the beverage
 */
public class Milk extends CondimentDecorator{
    // reference for the Component to which milk will be added
    Beverage beverage;

    /**
     * Create Milk topping wrapping the main beverage.
     * @param beverage - condiment to be wrapped with milk.
     */
    public Milk(Beverage beverage) {
        this.beverage = beverage;
    }

    /**
     * Topping will be added to beverage description.
     * @return - beverage description.
     */
    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Milk";
    }

    /**
     * Cost of topping will be added to main component.
     * @return - cost with a topping.
     */
    @Override
    public double cost() {
        return beverage.cost() + 0.10;
    }
}
