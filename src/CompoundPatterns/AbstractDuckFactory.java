package CompoundPatterns;

/**
 * Abstract Factory to create quackables.
 */
public abstract class AbstractDuckFactory {
   public abstract Quackable createMallardDuck();
   public abstract Quackable createRedheadDuck();
   public abstract Quackable createDuckCall();
   public abstract Quackable createRubberdDuck();
}
