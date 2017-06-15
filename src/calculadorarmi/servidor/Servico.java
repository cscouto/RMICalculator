/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadorarmi.servidor;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 *
 * @author Tiago
 */
public class Servico extends UnicastRemoteObject implements IStub{
    
    protected Servico() throws RemoteException{
        super();
    }
    private static final long serialVersionUID = 1L;

    @Override
    public float realizaCalculo(float n1, String operador, float n2) {
       float resultado =0;
        switch (operador){
            case "+":
                resultado = n1+n2;
                break;
            case "-":
                resultado = n1-n2;
                break;
            case "*":
                resultado = n1*n2;
                break;
            case "/":
                resultado  = n1/n2;
                break;
        }
        return resultado;
    }
    
}
