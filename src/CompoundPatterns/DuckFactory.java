package CompoundPatterns;

/**
 * Concrete duck factory producing Mallards and Redheads.
 */
public class DuckFactory extends AbstractDuckFactory {
    @Override
    public Quackable createMallardDuck() {
        return new MallardDuck();
    }

    @Override
    public Quackable createRedheadDuck() {
        return new RedheadDuck();
    }

    @Override
    public Quackable createDuckCall() {
        return new DuckCall();
    }

    @Override
    public Quackable createRubberdDuck() {
        return new RubberDuck();
    }

    public Quackable createGooseDuck(){
        return new GooseAdaptor(new Goose());
    }

}
