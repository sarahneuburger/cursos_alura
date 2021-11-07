package br.com.alura.lista;

public class TarefaImprimir implements Runnable {

	private Lista lista;
	
	public TarefaImprimir(Lista lista) {
		this.lista = lista;
	}

	@Override
	public void run() {
		
		if(!lista.estaCheia()) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e1) {
				e1.printStackTrace();
			}
		}
		synchronized (lista) {
			
			try {
				System.out.println("Aguardando notifica��o.");
				lista.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		for (int i = 0; i < lista.tamanho(); i++) {
			System.out.println(i + " - " + lista.pegaElemento(i));
		}

	}

}
