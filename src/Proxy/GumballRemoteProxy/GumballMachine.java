package Proxy.GumballRemoteProxy;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 * Gumball Machine, using different states to represent different behavior
 */
public class GumballMachine extends UnicastRemoteObject implements GumballMachineRemote {
    GumballMachineState noQuarterState;
    GumballMachineState hasQuarterState;
    GumballMachineState soldState;
    GumballMachineState winnerState;
    GumballMachineState soldOutState;


    GumballMachineState state = soldOutState;
    String location;
    int count = 0;

    // RemoteException is thrown in super class constructor
    public GumballMachine(String location, int count) throws RemoteException {
        noQuarterState = new NoQuarterState(this);
        hasQuarterState = new HasQuarterState(this);
        soldState = new SoldState(this);
        soldOutState = new SoldOutState(this);
        winnerState = new WinnerState(this);

        this.location = location;
        this.count = count;
        if(count > 0){
            state = noQuarterState;
        }
    }

    public GumballMachineState getState() {
        return state;
    }

    public void setState(GumballMachineState state) {
        this.state = state;
    }

    public GumballMachineState getNoQuarterState() {
        return noQuarterState;
    }

    public GumballMachineState getHasQuarterState() {
        return hasQuarterState;
    }

    public GumballMachineState getSoldState() {
        return soldState;
    }

    public GumballMachineState getWinnerState() {
        return winnerState;
    }

    public GumballMachineState getSoldOutState() {
        return soldOutState;
    }

    public int getCount() {
        return count;
    }

    public String getLocation() {
        return location;
    }

    public void insertQuarter(){
        state.insertQuarter();
    }

    public void turnCrank(){
        state.turnCrank();
        if(count > 0){
            state.dispense();
        }
    }

    public void ejectQuarter(){
        state.ejectQuarter();
    }

    public void releaseBall(){
        System.out.println("Gumball is rolling out.");
        if(count != 0) {
            count--;
        }
    }

    public void refill(int amount){
        if(count == 0){
            count += amount;
            this.setState(noQuarterState);
        } else {
            count += amount;
        }
    }

    public String toString() {
        return "\nThe Gumball Machine:\n" +
                "Location: " + getLocation() + "\n" +
                "State: " + state.toString() + "\n" +
                "# of gums: " + count + "\n";
    }


}
