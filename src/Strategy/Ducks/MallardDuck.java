package Strategy.Ducks;

import Strategy.FlyBehavior.FlyWithWings;
import Strategy.QuackBehavior.Quack;

/**
 * MallardDuck, subclass of Duck class.
 */
public class MallardDuck extends Duck{

    public MallardDuck() {
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }

    @Override
    public void display() {
        System.out.println("Displaying Mallard Duck.");
    }
}
