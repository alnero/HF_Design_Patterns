package Strategy.QuackBehavior;

/**
 * Quack behavior for the ducks that can't make any sound
 */
public class MuteQuack implements QuackBehavior{
    @Override
    public void quack() {
        System.out.println("< Mute >");
    }
}
