package CompoundPatterns;

import java.util.HashSet;
import java.util.Iterator;

/**
 * Flock of ducks. A collection of ducks.
 */
public class Flock implements Quackable{
    HashSet<Quackable> quackers = new HashSet<>();

    public void add(Quackable duck){
        quackers.add(duck);
    }

    @Override
    public void quack() {
        Iterator duckIterator = quackers.iterator();
        while(duckIterator.hasNext()){
            Quackable quacker = (Quackable) duckIterator.next();
            quacker.quack();
        }
    }

    @Override
    public void registerObserver(Observer observer) {
        for(Quackable quacker : quackers){
            quacker.registerObserver(observer);
        }
    }

    @Override
    public void notifyObservers() { }

    @Override
    public void removeObserver(Observer observer) {
        for(Quackable quacker : quackers){
            quacker.removeObserver(observer);
        }
    }

    @Override
    public String toString() {
        return "Flock of Ducks";
    }
}
