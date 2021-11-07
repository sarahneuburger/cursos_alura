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
		//List<String> lista = Collections.synchronizedList(new ArrayList<>());

		// Coleção que é já sincronizada por si só
		// Thread safe
		//List<String> listaVector = new Vector<String>();
		
		Lista lista = new Lista();

		for (int i = 0; i < 10; i++) {
			Thread thread = new Thread(new TarefaAdicionarElemento(lista, i));
			thread.start();
		}
		
		new Thread(new TarefaImprimir(lista)).start();

		//Thread.sleep(2000);

		// Dois threads acessando a mesma lista pode dar problema
	}

}
