package State;

/**
 * Interface defining all actions done by any gumball machine state.
 */
public interface GumballMachineState {
    void insertQuarter();
    void ejectQuarter();
    void turnCrank();
    void dispense();
}
