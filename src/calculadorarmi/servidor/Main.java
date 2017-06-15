/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadorarmi.servidor;

import calculadorarmi.servidor.Servico;
import calculadorarmi.servidor.Servico;
import java.rmi.AlreadyBoundException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

/**
 *
 * @author Tiago
 */
public class Main {
    public static void main(String[] args) throws RemoteException, 
            AlreadyBoundException {
        Servico srv = new Servico();
      //  Naming.rebind("rmi://localhost:1999/servico", srv);
        
        Registry registro = LocateRegistry.createRegistry(1999);
        registro.bind("servico", srv);
    }
}
