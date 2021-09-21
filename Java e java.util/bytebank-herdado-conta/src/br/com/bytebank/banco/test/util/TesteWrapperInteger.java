package br.com.bytebank.banco.test.util;

import java.util.ArrayList;
import java.util.List;

public class TesteWrapperInteger {
	
	public static void main(String[] args) {
		
		int idade = 26;
		List numeros = new ArrayList();
		
		// Autoboxing, apesar do List receber apenas objetos e idade ser primitiva, o 
		// Java converte automaticamente para o tipo object correspodente, neste caso
		// o Integer.
		numeros.add(idade);
		numeros.add(30);
		
		// Wrapper - "embrulhar" um primitivo em um objeto
		Integer idadeRef = Integer.valueOf(29); // autoboxing
		
		// Desembrulhando para primitivo
		int valor = idadeRef.intValue(); // unboxing
		
		// parsing, convertendo de string para integer
		String s = "10";
		Integer numeroConvertido = Integer.valueOf(s);
		int num = Integer.parseInt(s);
	
		// Constantes da classe Integer
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		System.out.println(Integer.SIZE);
		System.out.println(Integer.BYTES);
	
	}

}
