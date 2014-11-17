package Strategy.Ducks;

import Strategy.FlyBehavior.FlyNoWay;
import Strategy.QuackBehavior.Squeak;

/**
 * RubberDuck, subclass of Duck class, can't fly, squeaks instead of quack.
 */
public class RubberDuck extends Duck{

    public RubberDuck() {
        quackBehavior = new Squeak();
        flyBehavior = new FlyNoWay();
    }

    @Override
    public void display() {
        System.out.println("Displaying Rubber Duck.");
    }
}
