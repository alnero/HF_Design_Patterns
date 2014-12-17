package Proxy.GumballRemoteProxy;

/**
 * Gumball machine in working state, waiting for quarter.
 */
public class NoQuarterState implements GumballMachineState {
    transient GumballMachine gumMachine;

    public NoQuarterState(GumballMachine gumMachine) {
        this.gumMachine = gumMachine;
    }

    @Override
    public void insertQuarter() {
        gumMachine.setState(gumMachine.getHasQuarterState());
        System.out.println("The quarter is accepted.");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("Can't eject quarter - didn't receive any yet!");
    }

    @Override
    public void turnCrank() {
        System.out.println("Can't turn the crank - NO QUARTER inserted!");
    }

    @Override
    public void dispense() {
        System.out.println("Can't dispense - NO QUARTER received yet!");
    }

    public String toString(){
        return "WAIT FOR QUARTER";
    }
}
