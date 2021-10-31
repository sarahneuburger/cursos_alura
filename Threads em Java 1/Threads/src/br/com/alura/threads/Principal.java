package br.com.alura.threads;

// Threads em Java 1
public class Principal {

	// Quem carrega o main é a máquina virtual, que já traz uma thread
	public static void main(String[] args) throws Exception {

		System.out.println("Isso é a thread main.");
		
		// Irá encerrar a execução dessa thread em 30 segundos
		Thread.sleep(30000);
	}

}
