package Adapter.AnimalWorldAdapter;

/**
 * Test the Turkey to Duck adapter
 */
public class DuckTestDrive {
    public static void main(String[] args) {
        MallardDuck duck = new MallardDuck();
        Turkey turkey = new WildTurkey();
        TurkeyToDuckAdapter duckAdapter = new TurkeyToDuckAdapter(turkey);

        System.out.println("Turkey says and flies: ");
        turkey.gobble();
        turkey.fly();

        System.out.println("\nTest Duck");
        testDuck(duck);

        // try to pass Turkey as a Duck to testDuck() method
        System.out.println("\nTest adapter");
        testDuck(duckAdapter);
    }

    static void testDuck(Duck duck){
        duck.quack();
        duck.fly();
    }
}
