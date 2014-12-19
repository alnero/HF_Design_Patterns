package CompoundPatterns;

/**
 * Observable interface so some duck can be Observables.
 */
public interface QuackObservable {
    void registerObserver(Observer observer);
    void notifyObservers();
    void removeObserver(Observer observer);
}
