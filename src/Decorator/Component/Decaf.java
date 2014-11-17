package Decorator.Component;

/**
 * Beverage with 0 percent coffee in it.
 */
public class Decaf extends Beverage{
    /**
     * Adds description to the beverage.
     */
    public Decaf() {
        description = "Coffee without coffee";
    }

    /**
     * Cost of the decaf.
     * @return - cost of beverage.
     */
    @Override
    public double cost() {
        return 1.05;
    }
}
