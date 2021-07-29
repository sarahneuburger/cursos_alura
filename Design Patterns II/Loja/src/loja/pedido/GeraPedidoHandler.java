package loja.pedido;

import java.time.LocalDateTime;
import java.util.List;

import loja.acao.AcaoAposGerarPedido;
import loja.orcamento.Orcamento;

/**
 * Command
 * 
 * Utilizado hoje em dia o CommandHandler, pois � multiplataforma, mas f�cil
 * reproveitar. Sepera��o de dados com a separa��o dos comandos.
 * 
 * O padr�o pretende encapsular em um objeto todos os dados necess�rios para
 * realizar uma determinada a��o (comando), incluindo o m�todo a ser chamado, os
 * argumentos do m�todo e o objeto ao qual o m�todo pertence.
 * 
 * Esse modelo nos permite desacoplar objetos que produzem os comandos de seus
 * consumidores, por isso o padr�o � comumente conhecido como padr�o
 * produtor-consumidor.
 *
 * Um Command Handler tem como responsabilidade, normalmente, apenas orquestrar
 * as tarefas a serem executadas, ou seja, chamar as classes necess�rias que
 * realizam as tarefas desejadas.
 *
 * Observer
 * 
 * O Handler recebe os dados atrav�s da interface das a��es, logo, podem ser
 * criadas novas depend�ncias, sem alterar o handler em si. O contrutor j�
 * recebe a lista de a��es. Ouvinte de um evento. V�rios ouvintes ficam
 * aguardando a a��o ser� notificado para executar sua pr�pria. Diminuir
 * acomplamento.
 * 
 * Ent�o a ideia do Observer �, eu tenho ouvintes observadores, classes que est�o 
 * observando um determinado evento, uma determinada a��o. No caso seria a classe 
 * "EnviarEmailPedido". Ela � um observador. Ela est� observando alguma coisa e 
 * quando ela for chamada ela vai executar esse c�digo. No nosso exemplo um "System.out". 
 *
 * A classe de salvar pedido no banco tamb�m � um ouvinte, tamb�m � um observador. 
 * Ela est� observando uma a��o e quando ela for chamada ela vai fazer esse "System.out". 
 * E aqui � a classe que est� disparando esse evento. Ent�o o Observer � quando temos 
 * essa quest�o. Voc� tem um evento e voc� tem ouvintes ou observadores desses eventos. 
 * Esse Observer tamb�m � conhecido como listener. Voc� tem um listener, um ouvinte. 
 *
 * Ent�o tem essa diferen�a na nomenclatura, mas a ideia � a mesma. Eu tenho um evento 
 * que quando for disparado eu vou ter v�rios ouvintes que se inscreveram e est�o observando 
 * esse evento e eles v�o ser notificados. Essa que � a ideia. Em vez de voc� ter que sair 
 * correndo e chamando ouvinte por ouvinte, "Ouvinte 1 faz isso. Ouvinte 2 faz aquilo.
 * Ouvinte 3 faz aquilo", voc� simplesmente notifica. 
 */
public class GeraPedidoHandler {

	// Construtor com inje��o de depend�ncias: Repository, service

	private List<AcaoAposGerarPedido> acoes;

	public GeraPedidoHandler(List<AcaoAposGerarPedido> acoes) {
		this.acoes = acoes;
	}

	public void execute(GeraPedido dados) {
		Orcamento orcamento = new Orcamento();

		Pedido pedido = new Pedido(dados.getCliente(), LocalDateTime.now(), orcamento);

		acoes.forEach(a -> a.executarAcao(pedido));
	}

}
