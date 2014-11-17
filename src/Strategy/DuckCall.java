package Strategy;

import Strategy.QuackBehavior.Quack;
import Strategy.QuackBehavior.QuackBehavior;

/**
 * Device for making "duck" sounds
 */
public class DuckCall {
    QuackBehavior quackBehavior;

    public DuckCall() {
        this.quackBehavior = new Quack();
    }

    public void performQuack(){
        quackBehavior.quack();
    }
}
