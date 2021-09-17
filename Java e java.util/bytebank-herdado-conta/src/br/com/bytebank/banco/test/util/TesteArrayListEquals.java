package br.com.bytebank.banco.test.util;

import java.util.ArrayList;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;

public class TesteArrayListEquals {
	
	public static void main(String[] args) {
		
	
	ArrayList<Conta> lista = new ArrayList<Conta>();
	
	Conta cc = new ContaCorrente(22, 11);
	lista.add(cc);
	Conta cc2 = new ContaCorrente(22, 11);
	lista.add(cc2);
	System.out.println(lista.size());
	
	lista.remove(0);
	System.out.println(lista.size());
	
	Conta cc3 = new ContaCorrente(22, 11);
	lista.add(cc3);
	Conta cc4 = new ContaCorrente(22, 11);
	lista.add(cc4);
	System.out.println(lista.size());
	
	for (Object object : lista) {
		System.out.println(object);
	}
	
	
	
	
	}

}
