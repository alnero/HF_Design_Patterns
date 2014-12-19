package CompoundPatterns;

/**
 * Duck simulator
 */
public class DuckSimulator {
    public static void main(String[] args) {
        DuckSimulator simulator = new DuckSimulator();
        CountingDuckFactory factory = new CountingDuckFactory();
        simulator.simulate(factory);
    }

    private void simulate(AbstractDuckFactory factory) {
        Quackable redhead = factory.createRedheadDuck();
        Quackable rubber = factory.createRubberdDuck();
        Quackable duckCall = factory.createDuckCall();
        GooseAdaptor gooseDuck = new GooseAdaptor(new Goose());

        Flock flockOfDucks = new Flock();
        flockOfDucks.add(redhead);
        flockOfDucks.add(rubber);
        flockOfDucks.add(duckCall);
        flockOfDucks.add(gooseDuck);


        Quackable mallardOne = factory.createMallardDuck();
        Quackable mallardTwo = factory.createMallardDuck();
        Quackable mallardThree = factory.createMallardDuck();

        Flock flockOfMallards = new Flock();
        flockOfMallards.add(mallardOne);
        flockOfMallards.add(mallardTwo);
        flockOfMallards.add(mallardThree);

        // adding one composite to another
        flockOfDucks.add(flockOfMallards);

        System.out.println("\nDuck simulation:");
        // create an observer and register it with all elements in the composite
        Quackologist quackologist = new Quackologist();
        flockOfDucks.registerObserver(quackologist);

        System.out.println("\nSimulate the whole flock:");
        simulate(flockOfDucks);

        System.out.println("\nSimulate only Mallards:");
        simulate(flockOfMallards);

        System.out.println("\n" + QuackCount.getNumOfQuacks() + " quacks were counted.");
    }

    void simulate(Quackable quacker){
        quacker.quack();
    }
}
