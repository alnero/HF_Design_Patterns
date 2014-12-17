package Proxy.GumballRemoteProxy;

/**
 * Every 10 turn Gumball Machine gets into the Winner state dispensing two gumballs instead of one
 */
public class WinnerState implements GumballMachineState {
    transient GumballMachine gumMachine;

    public WinnerState(GumballMachine gumballMachine) {
        this.gumMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("Can't insert a quarter - already dispensing a gumball!");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("Can't eject quarter - already dispensing a gumball!");
    }

    @Override
    public void turnCrank() {
        System.out.println("Can't turn the crank - already dispensing a gumball!");
    }

    @Override
    public void dispense() {
        System.out.println("You WIN an extra gumball!");

        int count = gumMachine.getCount();
        if(count > 2){
            gumMachine.releaseBall();
            gumMachine.releaseBall();
            gumMachine.setState(gumMachine.getNoQuarterState());
        } else if (count == 2){
            gumMachine.releaseBall();
            gumMachine.releaseBall();
            gumMachine.setState(gumMachine.getSoldOutState());
        }
    }
}
