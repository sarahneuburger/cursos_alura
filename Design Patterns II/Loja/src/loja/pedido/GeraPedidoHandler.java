package loja.pedido;

import java.time.LocalDateTime;
import java.util.List;

import loja.acao.AcaoAposGerarPedido;
import loja.orcamento.Orcamento;

/**
 * Command
 * 
 * Utilizado hoje em dia o CommandHandler, pois é multiplataforma, mas fácil
 * reproveitar. Seperação de dados com a separação dos comandos.
 * 
 * O padrão pretende encapsular em um objeto todos os dados necessários para
 * realizar uma determinada ação (comando), incluindo o método a ser chamado, os
 * argumentos do método e o objeto ao qual o método pertence.
 * 
 * Esse modelo nos permite desacoplar objetos que produzem os comandos de seus
 * consumidores, por isso o padrão é comumente conhecido como padrão
 * produtor-consumidor.
 *
 * Um Command Handler tem como responsabilidade, normalmente, apenas orquestrar
 * as tarefas a serem executadas, ou seja, chamar as classes necessárias que
 * realizam as tarefas desejadas.
 *
 * Observer
 * 
 * O Handler recebe os dados através da interface das ações, logo, podem ser
 * criadas novas dependências, sem alterar o handler em si. O contrutor já
 * recebe a lista de ações. Ouvinte de um evento. Vários ouvintes ficam
 * aguardando a ação será notificado para executar sua própria. Diminuir
 * acomplamento.
 * 
 * Então a ideia do Observer é, eu tenho ouvintes observadores, classes que estão 
 * observando um determinado evento, uma determinada ação. No caso seria a classe 
 * "EnviarEmailPedido". Ela é um observador. Ela está observando alguma coisa e 
 * quando ela for chamada ela vai executar esse código. No nosso exemplo um "System.out". 
 *
 * A classe de salvar pedido no banco também é um ouvinte, também é um observador. 
 * Ela está observando uma ação e quando ela for chamada ela vai fazer esse "System.out". 
 * E aqui é a classe que está disparando esse evento. Então o Observer é quando temos 
 * essa questão. Você tem um evento e você tem ouvintes ou observadores desses eventos. 
 * Esse Observer também é conhecido como listener. Você tem um listener, um ouvinte. 
 *
 * Então tem essa diferença na nomenclatura, mas a ideia é a mesma. Eu tenho um evento 
 * que quando for disparado eu vou ter vários ouvintes que se inscreveram e estão observando 
 * esse evento e eles vão ser notificados. Essa que é a ideia. Em vez de você ter que sair 
 * correndo e chamando ouvinte por ouvinte, "Ouvinte 1 faz isso. Ouvinte 2 faz aquilo.
 * Ouvinte 3 faz aquilo", você simplesmente notifica. 
 */
public class GeraPedidoHandler {

	// Construtor com injeção de dependências: Repository, service

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
