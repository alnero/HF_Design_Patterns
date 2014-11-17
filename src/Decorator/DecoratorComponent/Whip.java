package Decorator.DecoratorComponent;

import Decorator.Component.Beverage;

/**
 * Whip topping for the beverage
 */
public class Whip extends CondimentDecorator{
    // reference for the Component to which whip will be added
    Beverage beverage;

    /**
     * Create Whip topping wrapping the main beverage.
     * @param beverage - condiment to be wrapped with whip.
     */
    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }

    /**
     * Topping will be added to beverage description.
     * @return - beverage description.
     */
    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Whip";
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
