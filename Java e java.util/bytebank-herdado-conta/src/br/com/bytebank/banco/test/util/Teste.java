package br.com.bytebank.banco.test.util;

import java.util.ArrayList;
import java.util.List;

public class Teste {
	
	public static void main(String[] args) {
		
		int idade = 26;
		List numeros = new ArrayList();
		
		// Autoboxing, apesar do List receber apenas objetos e idade ser primitiva, o 
		// Java converte automaticamente para o tipo object correspodente, neste caso
		// o Integer.
		numeros.add(idade);
	}

}
