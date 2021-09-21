package br.com.bytebank.banco.test.util;

import java.util.ArrayList;
import java.util.List;

public class TesteOutrosWrappers {

	public static void main(String[] args) {

		// Wrapper - "embrulhar" um primitivo em um objeto
		Integer idadeRef = Integer.valueOf(29); //autoboxing
		
		// Desembrulhando para primitivo
		int valor = idadeRef.intValue(); //unboxing

		
		Double dRef = Double.valueOf(2.2); //autoboxing
		System.out.println(dRef.doubleValue()); //unboxing
		
		Boolean bRef = Boolean.FALSE; //autoboxing - já foi via os valores em constantes
		System.out.println(bRef.booleanValue()); //unboxing
		
		// Number, é extentida pelas classes de objetos dos primitivos (Integer, Double, etc)
		Number refNumero = Float.valueOf(29.2f);
		
		List<Number> numbers = new ArrayList<Number>();
		numbers.add(35);
		numbers.add(12.2); //aceita todo tipo de número
		
	}

}
