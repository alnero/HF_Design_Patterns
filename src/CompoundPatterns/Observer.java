package CompoundPatterns;

/**
 * Observers looking for the ducks and their quacks.
 */
public interface Observer {
    void update(QuackObservable observable);
}
