package Decorator.Component;

/**
 * Dark roast coffee
 */
public class DarkRoast extends Beverage {

    /**
     * Adds description to the beverage.
     */
    public DarkRoast() {
        description = "Dark roast coffee";
    }

    /**
     * Cost of the dark roast coffee.
     * @return - cost of beverage.
     */
    @Override
    public double cost() {
        return 0.99;
    }
}
