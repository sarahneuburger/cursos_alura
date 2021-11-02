package br.com.alura.banheiro;

public class Banheiro {

	public void numero1() {
		String nome = Thread.currentThread().getName();

		// Ocorre em paralelo, pois n�o impacta no restante da execu��o
		System.out.println(nome + " est� batendo na porta.");
		
		// Sincronizar a execu��o, apenas uma thread por vez
		// Executa uma vez atrav�s da mesma thread
		// Executa todo esse bloco antes de liberar o pr�ximo m�todo
		synchronized (this) {
			System.out.println(nome + ", entra no banheiro.");
			System.out.println(nome + ", executa tarefa r�pida.");

			try {
				Thread.sleep(5000);
			} catch (Exception e) {
				e.printStackTrace();
			}

			System.out.println(nome + ", lava as m�os.");
			System.out.println(nome + ", sai do banheiro.");
		}

	}

	public void numero2() {
		String nome = Thread.currentThread().getName();
		
		System.out.println(nome + " est� batendo na porta.");

		// Sincronizar a execu��o, apenas uma thread por vez
		synchronized (this) {
			System.out.println(nome + ", entra no banheiro.");
			System.out.println(nome + ", executa tarefa demorada.");

			try {
				Thread.sleep(10000);
			} catch (Exception e) {
				e.printStackTrace();
			}

			System.out.println(nome + ", lava as m�os");
			System.out.println(nome + ", sai do banheiro");
		}
	}

}
