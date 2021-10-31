
package br.com.alura.threads;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;
import javax.swing.JTextField;

public class AcaoBotao implements ActionListener {

	private JTextField primeiro;
	private JTextField segundo;
	private JLabel resultado;

	public AcaoBotao(JTextField primeiro, JTextField segundo, JLabel resultado) {
		this.primeiro = primeiro;
		this.segundo = segundo;
		this.resultado = resultado;
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		// Para rodar a thread é preciso passar no construtor um Runnable (classe
		// TarefaMultiplicacao).
		TarefaMultiplicacao tarefa = new TarefaMultiplicacao(primeiro, segundo, resultado);
		Thread threadCalculo = new Thread(tarefa, "Thread Calculadora"); // Passando um Runnable e o nome da Thread no construtor

		// Iniciando de fato a thread
		threadCalculo.start();
		
		// Utilizar outra thread faz o processo executar por baixo dos panos, sem travar
		// a aplicação.
	}

}