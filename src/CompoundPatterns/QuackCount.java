package CompoundPatterns;

/**
 * Decorator to count number of quacks.
 */
public class QuackCount implements Quackable {
    Quackable duck;
    static int numOfQuacks;

    public QuackCount(Quackable duck) {
        this.duck = duck;
    }

    @Override
    public void quack() {
        numOfQuacks++;
        duck.quack();
    }

    public static int getNumOfQuacks() {
        return numOfQuacks;
    }

    @Override
    public void registerObserver(Observer observer) {
        duck.registerObserver(observer);
    }

    @Override
    public void notifyObservers() {
        duck.notifyObservers();
    }

    @Override
    public void removeObserver(Observer observer) {
        duck.removeObserver(observer);
    }
}
