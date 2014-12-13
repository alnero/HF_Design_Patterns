package State;

/**
 * Testing the Gumball Machine
 */
public class GumballMachineTestDrive {
    public static void main(String[] args) {
        GumballMachine gumMachine = new GumballMachine(5);

        System.out.println(gumMachine);
        gumMachine.insertQuarter();
        gumMachine.turnCrank();

        System.out.println(gumMachine);
        gumMachine.insertQuarter();
        gumMachine.ejectQuarter();
        gumMachine.turnCrank();

        System.out.println(gumMachine);
        gumMachine.insertQuarter();
        gumMachine.turnCrank();
        gumMachine.insertQuarter();
        gumMachine.turnCrank();
        gumMachine.ejectQuarter();

        System.out.println(gumMachine);
        gumMachine.insertQuarter();
        gumMachine.insertQuarter();
        gumMachine.turnCrank();
        gumMachine.insertQuarter();
        gumMachine.turnCrank();
        gumMachine.insertQuarter();
        gumMachine.turnCrank();

        System.out.println(gumMachine);

    }

}
