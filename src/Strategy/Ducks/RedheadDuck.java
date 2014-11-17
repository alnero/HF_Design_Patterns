package Strategy.Ducks;

import Strategy.FlyBehavior.FlyWithWings;
import Strategy.QuackBehavior.Quack;

/**
 * RedheadDuck, subclass of Duck class.
 */
public class RedheadDuck extends Duck{

    public RedheadDuck() {
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }

    @Override
    public void display() {
        System.out.println("Displaying Redhead Duck.");
    }
}
