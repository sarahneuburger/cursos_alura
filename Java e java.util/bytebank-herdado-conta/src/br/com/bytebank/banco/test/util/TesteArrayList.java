package br.com.bytebank.banco.test.util;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;

public class TesteArrayList {
	
	public static void main(String[] args) {
		
	ArrayList<Conta> lista = new ArrayList<Conta>();

	// Vector, informações nas anotações
	List<Conta> vector = new Vector<Conta>(); //thread safe

	// LinkedList, informações nas anotações
	LinkedList<Conta> linked = new LinkedList<Conta>();
	
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
	
	
	System.out.println(lista.contains(cc4));
	
	// equals da classe Object compara referências, para alterar os critérios de igualdade, é preciso reescrever o método.
	
	
	}

}
