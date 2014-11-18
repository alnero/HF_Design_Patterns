package Adapter.AnimalWorldAdapter;

/**
 * Making a duck look like Turkey
 */
public class DuckToTurkeyAdapter implements Turkey {
    Duck duck;

    public DuckToTurkeyAdapter(Duck duck) {
        this.duck = duck;
    }


    @Override
    public void gobble() {
        duck.quack();
    }

    @Override
    public void fly() {
        duck.fly();
        System.out.print(" I was tired and flied less.");
    }
}
