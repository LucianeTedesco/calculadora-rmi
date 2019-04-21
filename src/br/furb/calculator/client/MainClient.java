package br.furb.calculator.client;

import java.rmi.registry.*;

import br.furb.calculator.common.CalculatorServerInterface;

public class MainClient {
	public static void main(String[] args) {
		try {
			Registry registry = LocateRegistry.getRegistry("localhost");
			CalculatorServerInterface c = (CalculatorServerInterface) registry.lookup("CalculatorServerInterfaceImpl");
			System.out.println("O objeto servidor " + c + " foi encontrado com sucesso.\n");
			// vamos efetuar uma soma?
			System.out.println("A soma de 2 + 5 é: " + c.sum(2, 5));
		} catch (Exception ex) {
			System.out.println(ex);
		}
	}
}