package State;

/**
 * State when quarter was inserted and crank was turned.
 */
public class SoldState implements GumballMachineState{
    GumballMachine gumMachine;

    public SoldState(GumballMachine gumballMachine) {
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
        gumMachine.releaseBall();
        int count = gumMachine.getCount();
        if(count == 0){
            gumMachine.setState(gumMachine.getSoldOutState());
            System.out.println("NO GUMBALLS in the machine!");
        } else {
            gumMachine.setState(gumMachine.getNoQuarterState());
        }
    }

    public String toString(){
        return "DISPENSING A GUMBALL";
    }
}
