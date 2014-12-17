package Proxy;

/**
 * Class to monitor Gumball Machines and produce a report on their status.
 */
public class GumballMonitor {
    GumballMachineRemote gumMachine;

    public GumballMonitor(GumballMachineRemote gumMachine) {
        this.gumMachine = gumMachine;
    }

    public void report(){
        try {
            System.out.println("-The Gumball Machine-");
            System.out.println("Location: " + gumMachine.getLocation());
            System.out.println("Inventory: " + gumMachine.getCount() + " gumballs");
            System.out.println("Status: " + gumMachine.getState().toString() + "\n");
        } catch (Exception e){
            e.printStackTrace();
        }
    }
}
