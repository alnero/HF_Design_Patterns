package Proxy;

import java.rmi.*;
import java.rmi.registry.LocateRegistry;

/**
 * Testing the Gumball Machine
 */
public class GumballMachineTestDrive {
    public static void main(String[] args) {
        GumballMachineRemote gumMachine = null;

        try {
            gumMachine = new GumballMachine("boston.gumball.com", 100);
            // Create local rmi registry with the port# 2020
            LocateRegistry.createRegistry(2020);
            Naming.rebind("//localhost:2020/gumMachine", gumMachine);
        } catch (Exception e){
            e.printStackTrace();
        }


    }

}
