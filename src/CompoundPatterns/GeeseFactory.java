package CompoundPatterns;

/**
 * Concrete factory creating geese.
 */
public class GeeseFactory extends AbstractGeeseFactory{

    @Override
    public Goose createGoose() {
        return new Goose();
    }
}
