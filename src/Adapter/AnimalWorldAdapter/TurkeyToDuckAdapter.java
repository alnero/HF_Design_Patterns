package Adapter.AnimalWorldAdapter;

/**
 * Adapter for Turkey to make it a Duck.
 */
public class TurkeyToDuckAdapter implements Duck {
    Turkey turkey;

    public TurkeyToDuckAdapter(Turkey turkey) {
        this.turkey = turkey;
    }


    @Override
    public void quack() {
        turkey.gobble();
    }

    @Override
    public void fly() {
        for(int i = 0; i < 5; i++){
            turkey.fly();
        }
    }
}
