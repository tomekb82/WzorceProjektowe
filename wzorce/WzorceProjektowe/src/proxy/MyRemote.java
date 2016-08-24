package proxy;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 * Created by tomek on 23.08.16.
 */
public interface MyRemote extends Remote {

    String sayHello() throws RemoteException;
}
