package proxy;

import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 * Created by tomek on 23.08.16.
 */
public class MyRemoteImpl extends UnicastRemoteObject implements MyRemote {

    public static final String REMOTE_HELLO = "RemoteHello";

    protected MyRemoteImpl() throws RemoteException {
    }

    @Override
    public String sayHello() throws RemoteException {
        return "Remote says, hello";
    }

    public static void main(String[] args) {

        try {
            MyRemote service = new MyRemoteImpl();
            Naming.rebind(REMOTE_HELLO, service);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
