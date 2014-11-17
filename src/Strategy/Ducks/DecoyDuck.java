package Strategy.Ducks;

import Strategy.FlyBehavior.FlyNoWay;
import Strategy.QuackBehavior.MuteQuack;

/**
 * DecoyDuck subclass of Duck class, doesn't quack or fly at all.
 */
public class DecoyDuck extends Duck{

    public DecoyDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new MuteQuack();
    }

    @Override
    public void display() {
        System.out.println("Displaying Decoy Duck");
    }
}
