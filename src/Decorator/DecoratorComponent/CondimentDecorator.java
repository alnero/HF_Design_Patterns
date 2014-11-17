package Decorator.DecoratorComponent;

import Decorator.Component.Beverage;

/**
 * Superclass for all of the decorators
 */
public abstract class CondimentDecorator extends Beverage {
    public abstract String getDescription();
}
