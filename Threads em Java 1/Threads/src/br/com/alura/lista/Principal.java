package br.com.alura.lista;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Vector;

public class Principal {

	public static void main(String[] args) throws InterruptedException {

		// ArrayList não é thread safe, não é sincronizada
		// Para ser sincronizada, é necessário utilizar o método abaixo da classe
		// Collections
		List<String> lista = Collections.synchronizedList(new ArrayList<>());

		// Coleção que é já sincronizada por si só
		// Thread safe
		List<String> listaVector = new Vector<String>();

		for (int i = 0; i < 10; i++) {
			Thread thread = new Thread(new TarefaAdicionarElemento(listaVector, i));
			thread.start();
		}

		Thread.sleep(2000);

		// Dois threads acessando a mesma lista pode dar problema
		for (int i = 0; i < listaVector.size(); i++) {
			System.out.println(listaVector.get(i));
		}
	}

}
