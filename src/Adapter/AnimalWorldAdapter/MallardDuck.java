package Adapter.AnimalWorldAdapter;

/**
 * Concrete implementation of Duck interface the Mallard Duck.
 */
public class MallardDuck implements Duck{
    @Override
    public void quack() {
        System.out.println("Quack! Quack!");
    }

    @Override
    public void fly() {
        System.out.println("I am flying a long distance.");
    }
}
