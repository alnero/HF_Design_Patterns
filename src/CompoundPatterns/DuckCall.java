package CompoundPatterns;

/**
 * Special thing that used in hunting on ducks. It makes the "Kwak" sound.
 */
public class DuckCall implements Quackable{
    Observable observable;

    public DuckCall() {
        this.observable = new Observable(this);
    }

    @Override
    public void quack() {
        System.out.println("Kwak");
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
        return "DuckCall";
    }
}
