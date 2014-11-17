package Strategy.QuackBehavior;

/**
 * Quack behavior for the ducks that can't quack
 */
public class Squeak implements QuackBehavior{
    @Override
    public void quack() {
        System.out.println("Squeak.");
    }
}
