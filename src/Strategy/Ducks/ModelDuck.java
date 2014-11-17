package Strategy.Ducks;

import Strategy.FlyBehavior.FlyNoWay;
import Strategy.QuackBehavior.Quack;

/**
 * Model of the duck, will change behavior on the fly.
 */
public class ModelDuck extends Duck{

    public ModelDuck() {
        quackBehavior = new Quack();
        flyBehavior = new FlyNoWay();
    }

    @Override
    public void display() {
        System.out.println("Displaying a model duck.");
    }
}
