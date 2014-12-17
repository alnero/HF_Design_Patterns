package Proxy;

import java.rmi.*;

/**
 * Interface for the remote service (Java RMI)
 */
public interface GumballMachineRemote extends Remote{
    int getCount() throws RemoteException;
    String getLocation() throws RemoteException;
    GumballMachineState getState() throws RemoteException;
}
