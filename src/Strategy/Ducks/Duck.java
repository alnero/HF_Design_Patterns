package Strategy.Ducks;

import Strategy.FlyBehavior.FlyBehavior;
import Strategy.QuackBehavior.QuackBehavior;

/**
 * Initial Duck superclass, has main behavior for all subclasses.
 */
public abstract class Duck {
    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;

    protected Duck() {
    }

    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }

    public void performQuack(){
        quackBehavior.quack();
    }

    public void performFly(){
        flyBehavior.fly();
    }

    public void swim(){
        System.out.println("Duck is swimming.");
    }

    public abstract void display();
}
