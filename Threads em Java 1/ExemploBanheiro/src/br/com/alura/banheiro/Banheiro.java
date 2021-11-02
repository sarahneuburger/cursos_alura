package br.com.alura.banheiro;

public class Banheiro {

	public void numero1() {
		String nome = Thread.currentThread().getName();

		// Ocorre em paralelo, pois não impacta no restante da execução
		System.out.println(nome + " está batendo na porta.");
		
		// Sincronizar a execução, apenas uma thread por vez
		// Executa uma vez através da mesma thread
		// Executa todo esse bloco antes de liberar o próximo método
		synchronized (this) {
			System.out.println(nome + ", entra no banheiro.");
			System.out.println(nome + ", executa tarefa rápida.");

			try {
				Thread.sleep(5000);
			} catch (Exception e) {
				e.printStackTrace();
			}

			System.out.println(nome + ", lava as mãos.");
			System.out.println(nome + ", sai do banheiro.");
		}

	}

	public void numero2() {
		String nome = Thread.currentThread().getName();
		
		System.out.println(nome + " está batendo na porta.");

		// Sincronizar a execução, apenas uma thread por vez
		synchronized (this) {
			System.out.println(nome + ", entra no banheiro.");
			System.out.println(nome + ", executa tarefa demorada.");

			try {
				Thread.sleep(10000);
			} catch (Exception e) {
				e.printStackTrace();
			}

			System.out.println(nome + ", lava as mãos");
			System.out.println(nome + ", sai do banheiro");
		}
	}

}
