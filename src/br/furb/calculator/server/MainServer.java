package br.furb.calculator.server;

import java.rmi.registry.*;

import br.furb.calculator.common.CalculatorServerInterface;
import br.furb.calculator.common.CalculatorServerInterfaceImpl;

public class MainServer {
	public static void main(String[] args) {
		try {
			CalculatorServerInterface sdrmi = new CalculatorServerInterfaceImpl();
			Registry registry = LocateRegistry.getRegistry();
			registry.rebind("CalculatorServerInterfaceImpl", sdrmi);
			System.out.println("Servidor Calculadora " + sdrmi + " registrado e pronto para aceitar solicitações.");
		} catch (Exception ex) {
			System.out.println("Houve um erro: " + ex.getMessage());
		}
	}
}