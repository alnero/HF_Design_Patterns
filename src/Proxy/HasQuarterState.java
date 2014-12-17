package Proxy;

import java.util.Random;

/**
 * Behavior when there is a quarter in Gumball Machine
 */
public class HasQuarterState implements GumballMachineState {
    transient GumballMachine gumMachine;
    Random randomWinner = new Random(System.currentTimeMillis());

    public HasQuarterState(GumballMachine gumballMachine) {
        this.gumMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("Can't insert a quarter - already have one!");
    }

    @Override
    public void ejectQuarter() {
        gumMachine.setState(gumMachine.getNoQuarterState());
        System.out.println("Giving back your quarter.");
    }

    @Override
    public void turnCrank() {
        int winner = randomWinner.nextInt(10);
        if(winner == 0 && gumMachine.getCount() > 1){
            gumMachine.setState(gumMachine.getWinnerState());
        } else {
            gumMachine.setState(gumMachine.getSoldState());
        }
        System.out.println("Crank is turned.");
    }

    @Override
    public void dispense() {
        System.out.println("Can't dispense - turn the crank first!");
    }

    public String toString(){
        return "QUARTER IS INSERTED";
    }
}
