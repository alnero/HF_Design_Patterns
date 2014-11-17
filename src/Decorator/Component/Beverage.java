package Decorator.Component;

/**
 * Abstract class of all beverages.
 */
public abstract class Beverage {
    // Beverage description
    String description = "Unknown";

    /**
     * Just tells what beverage is it.
     * @return - description of beverage.
     */
    public String getDescription(){
        return description;
    }

    /**
     * Calculates the cost of beverage.
     * @return - double price of the beverage.
     */
    public abstract double cost();
}
