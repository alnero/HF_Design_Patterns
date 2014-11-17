package Strategy.FlyBehavior;

/**
 * Class represents fly with wings behavior
 */
public class FlyWithWings implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("Flying with the wings.");
    }
}
