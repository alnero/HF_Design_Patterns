package Proxy;

import java.rmi.Naming;

/**
 * Testing monitors using Java RMI to check remote Gumball Machines.
 */
public class GumballMonitorTestDrive {
    public static void main(String[] args) {
        String location = "rmi://localhost:2020/gumMachine";
        GumballMonitor monitor = null;
        try {
            GumballMachineRemote gumMachine = (GumballMachineRemote) Naming.lookup(location);
            monitor = new GumballMonitor(gumMachine);
            System.out.println(monitor + "\n");
            monitor.report();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}

