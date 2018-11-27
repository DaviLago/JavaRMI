package Main;

import RMI.ServerRMI;
import java.rmi.RemoteException;

public class Main {

    /**
     * @param args the command line arguments
     * @throws java.rmi.RemoteException
     */
    public static void main(String[] args) throws RemoteException {
        System.out.print("Servidor ativo...\n");
        new ServerRMI();        
    }        
}
