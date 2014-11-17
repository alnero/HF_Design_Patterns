package Decorator.Component;

/**
 * Espresso coffee
 */
public class Espresso extends Beverage {

    /**
     * Adds description to the beverage.
     */
    public Espresso() {
        description = "Espresso coffee";
    }

    /**
     * Cost of the espresso coffee.
     * @return - cost of beverage.
     */
    @Override
    public double cost() {
        return 1.99;
    }
}
