/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadorarmi.servidor;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 *
 * @author Tiago
 */
public interface IStub extends Remote{
    public float realizaCalculo(float n1, String operador, float n2) throws RemoteException;
}
