package CompoundPatterns;

/**
 * Some scientist interested in those making quacks.
 */
public class Quackologist implements Observer{
    @Override
    public void update(QuackObservable observable) {
        System.out.println("Quackologist: " + observable + " just quacked!");
    }
}
