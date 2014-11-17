package Decorator.Component;

/**
 * House blend coffee
 */
public class HouseBlend extends Beverage {

    /**
     * Adds description to the beverage.
     */
    public HouseBlend() {
        description = "House blend coffee";
    }

    /**
     * Cost of the house blend coffee.
     * @return - cost of beverage.
     */
    @Override
    public double cost() {
        return 0.89;
    }
}
