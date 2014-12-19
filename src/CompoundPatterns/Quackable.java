package CompoundPatterns;

/**
 * Common interface for all of the ducks, suffering implementation of several patterns.
 */
public interface Quackable extends QuackObservable {
    void quack();
}
