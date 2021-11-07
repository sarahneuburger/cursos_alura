package br.com.alura.lista;

public class Lista {
	private String[] elementos = new String[100];
	private int indice = 0;

	public void adicionaElementos(String elemento) {

		// Sincronizando para executar um por vez
		synchronized (this) {
			this.elementos[indice] = elemento;
			this.indice++;

			try {
				Thread.sleep(5);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

			if (this.indice == this.elementos.length) {
				System.out.println("Lista est� cheia, notificando.");
				this.notify();
			}
		}
	}

	public int tamanho() {
		return this.elementos.length;
	}

	public String pegaElemento(int posicao) {
		return this.elementos[posicao];
	}

	public boolean estaCheia() {
		return this.indice == this.tamanho();
	}
}