package br.com.alura.banheiro;

public class Banheiro {

	private boolean ehSujo = true;

	public void numero1() {

		String nome = Thread.currentThread().getName();

		// Ocorre em paralelo, pois n�o impacta no restante da execu��o
		System.out.println(nome + " est� batendo na porta.");

		// Sincronizar a execu��o, apenas uma thread por vez
		// Executa uma vez atrav�s da mesma thread
		// Executa todo esse bloco antes de liberar o pr�ximo m�todo
		synchronized (this) {
			System.out.println(nome + ", entra no banheiro.");

			if (ehSujo) {
				esperaLaFora(nome);
			}

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

	public void limpa() {

		String nome = Thread.currentThread().getName();
		System.out.println(nome + " est� batendo na porta.");

		synchronized (this) {
			System.out.println(nome + ", entra no banheiro.");

			if (!ehSujo) {
				System.out.println(nome + ", n�o est� sujo.");
				return;
			}

			System.out.println(nome + ", limpando o banheiro.");
			this.ehSujo = false;

			try {
				Thread.sleep(13000);
			} catch (Exception e) {
				e.printStackTrace();
			}

			this.notifyAll();
			System.out.println(nome + ", sai do banheiro");
		}
	}

	private void esperaLaFora(String nome) {
		System.out.println(nome + " - Est� sujo.");
		try {
			// Para a execu��o e fica esperando
			this.wait();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
