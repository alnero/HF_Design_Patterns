package Proxy.GumballRemoteProxy;

/**
 * Empty state of the Gumball Machine.
 */
public class SoldOutState implements GumballMachineState {
    transient GumballMachine gumMachine;

    public SoldOutState(GumballMachine gumballMachine) {
        this.gumMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("Can't insert a quarter - NO GUMBALLS in the machine!");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("Can't eject quarter - NO GUMBALLS in the machine!");
    }

    @Override
    public void turnCrank() {
        System.out.println("Can't turn the crank - NO GUMBALLS in the machine!");
    }

    @Override
    public void dispense() {
        System.out.println("Can't dispense - NO GUMBALLS in the machine!");
    }

    public String toString(){
        return "EMPTY";
    }
}
