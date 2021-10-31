package br.com.alura.threads;

public class ExemploClasseAnonima {

	public static void main(String[] args) {

		// Utilizando classe anônima para criar a thread
		new Thread(new Runnable() {
			@Override
			public void run() {
				System.out.println("resposta");
			}
		}).start();
	}

}
