package RMI;

import Model.Estacao;
import Model.LinhaMetro;
import Model.LinhaTrem;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

public interface IEstacao extends Remote {
    public List<LinhaTrem> getLinhasTrem() throws RemoteException;
    public List<LinhaMetro> getLinhasMetro()throws RemoteException;
    public Estacao getEstacao()throws RemoteException;
}
