package CompoundPatterns;

/**
 * Factory creating quackables decorated with counter.
 */
public class CountingDuckFactory extends AbstractDuckFactory {
    @Override
    public Quackable createMallardDuck() {
        return new QuackCount(new MallardDuck());
    }

    @Override
    public Quackable createRedheadDuck() {
        return new QuackCount(new RedheadDuck());
    }

    @Override
    public Quackable createDuckCall() {
        return new QuackCount(new DuckCall());
    }

    @Override
    public Quackable createRubberdDuck() {
        return new QuackCount(new RubberDuck());
    }
}
