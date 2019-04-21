package br.furb.calculator.common;

import java.rmi.*;
import java.rmi.server.*;

public class CalculatorServerInterfaceImpl extends UnicastRemoteObject implements CalculatorServerInterface {
	public CalculatorServerInterfaceImpl() throws RemoteException {
    // construtor padrão
	}

    // método público que recebe dois valores inteiros e retorna sua soma
	public int sum(int a, int b) throws RemoteException {
		System.out.println("Somar: A " + a + " B " + b);
		return a + b;
	}
}