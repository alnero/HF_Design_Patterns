package Proxy;

import java.io.Serializable;

/**
 * Interface defining all actions done by any gumball machine state.
 * All classes of the state are made Serializable in order to be transferred over the network.
 * 'transient' key-word was added to all GumballMachine objects in all State implementations to make them Serializable.
 */
public interface GumballMachineState extends Serializable{
    void insertQuarter();
    void ejectQuarter();
    void turnCrank();
    void dispense();
}
