package CompoundPatterns;

/**
 * An adaptor allowing goose to be seemed like a duck.
 */
public class GooseAdaptor implements Quackable{
    Goose goose;
    Observable observable;

    public GooseAdaptor(Goose goose) {
        this.goose = goose;
        observable = new Observable(this);
    }

    @Override
    public void quack() {
        goose.honk();
        notifyObservers();
    }

    @Override
    public void registerObserver(Observer observer) {
        observable.registerObserver(observer);
    }

    @Override
    public void notifyObservers() {
        observable.notifyObservers();
    }

    @Override
    public void removeObserver(Observer observer) {
        observable.removeObserver(observer);
    }

    @Override
    public String toString() {
        return "Goose pretending to be a duck";
    }
}
