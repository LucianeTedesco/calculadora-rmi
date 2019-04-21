package br.furb.calculator.common;

import java.rmi.*;

public interface CalculatorServerInterface extends Remote {
	// método público que recebe dois valores inteiros e retorna sua soma
	public int sum(int a, int b) throws RemoteException;
}