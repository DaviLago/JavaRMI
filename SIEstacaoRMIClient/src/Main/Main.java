/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import RMI.IEstacao;
import View.EstacaoViewFrame;
import View.MenuView;
import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import javax.swing.JOptionPane;

/**
 *
 * @author cce-teste11
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        IEstacao estacao = null;
        try {
            //LocateRegistry.getRegistry("192.168.0.102");
            LocateRegistry.getRegistry("localhost");
            estacao = (IEstacao) Naming.lookup("rmi://localhost:9999/EstacaoService" );
            
            MenuView.main(estacao);
            
        } catch (MalformedURLException | RemoteException | NotBoundException e){
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Um erro ocorreu ao tentar acessar o servidor", "Erro", JOptionPane.ERROR_MESSAGE);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
