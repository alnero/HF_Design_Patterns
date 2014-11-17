package Strategy.QuackBehavior;

/**
 * Normal quack behavior for the duck
 */
public class Quack implements QuackBehavior{
    @Override
    public void quack() {
        System.out.println("Quack.");
    }
}
