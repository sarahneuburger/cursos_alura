package br.com.alura.threads;

// Threads em Java 1
public class Principal {

	// Quem carrega o main � a m�quina virtual, que j� traz uma thread
	public static void main(String[] args) throws Exception {

		System.out.println("Isso � a thread main.");
		
		// Ir� encerrar a execu��o dessa thread em 30 segundos
		Thread.sleep(30000);
	}

}
