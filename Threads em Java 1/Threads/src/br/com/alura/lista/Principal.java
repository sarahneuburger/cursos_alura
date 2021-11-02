package br.com.alura.lista;

public class Principal {

	public static void main(String[] args) throws InterruptedException {

		Lista lista = new Lista();
		
		for (int i = 0; i < 10; i++) {
			Thread thread = new Thread(new TarefaAdicionarElemento(lista, i));
			thread.start();
		}
		
		Thread.sleep(2000);
		
		// Dois threads acessando a mesma lista pode dar problema
		for (int i = 0; i < lista.tamanho(); i++) {
			System.out.println(lista.pegaElemento(i));
		}
	}

}
