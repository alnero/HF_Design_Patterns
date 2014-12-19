package CompoundPatterns;

import java.util.HashSet;


/**
 * Concrete class to be observed. We will use composition and delegation not to implement all QuackObservable methods in
 * every Quackable class.
 */
public class Observable implements QuackObservable{
    HashSet<Observer> observers = new HashSet<>();
    QuackObservable duck;

    public Observable(QuackObservable duck) {
        this.duck = duck;
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void notifyObservers() {
        for(Observer o : observers){
            o.update(duck);
        }
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }
}
