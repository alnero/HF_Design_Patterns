package Strategy.FlyBehavior;

/**
 * Behavior for the ducks that can't fly
 */
public class FlyNoWay implements FlyBehavior{
    @Override
    public void fly() {
        System.out.println("Can't fly");
    }
}
