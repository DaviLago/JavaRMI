package RMI;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;

public class ServerRMI {
    public ServerRMI(){
        try {
            IEstacao estacao = new IEstacaoImpl();
            LocateRegistry.createRegistry(9999);
            Naming.rebind("rmi://localhost:9999/EstacaoService", estacao);
        }catch( MalformedURLException | RemoteException e ){ 
            e.printStackTrace();
        }
    }
}
