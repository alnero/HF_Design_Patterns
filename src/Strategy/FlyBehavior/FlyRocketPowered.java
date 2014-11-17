package Strategy.FlyBehavior;

/**
 * Rocket power flying
 */
public class FlyRocketPowered implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("Rocket fly.");
    }
}
