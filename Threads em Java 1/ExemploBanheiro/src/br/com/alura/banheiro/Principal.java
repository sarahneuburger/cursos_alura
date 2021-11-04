package br.com.alura.banheiro;

public class Principal {

	public static void main(String[] args) {

		Banheiro banheiro = new Banheiro();

		Thread convidado1 = new Thread(new TarefaNumero1(banheiro), "Nome1");
		Thread convidado2 = new Thread(new TarefaNumero1(banheiro), "Nome2");
		Thread limpeza = new Thread(new TarefaLimpeza(banheiro), "Limpeza"); 
		Thread convidado3 = new Thread(new TarefaNumero1(banheiro), "Nome3");
		Thread convidado4 = new Thread(new TarefaNumero1(banheiro), "Nome4");
		
		// As duas threads compoartilham o mesmo objeto, a execução ocorre simultaneamente
		// Neste cenário, uma tarefa deveria executar completamente primeiro, para a próxima iniciar
		// Sincronizar o acesso
		convidado1.start();
		convidado2.start();
		limpeza.start();
		convidado3.start();
		convidado4.start();
		
	}

}
