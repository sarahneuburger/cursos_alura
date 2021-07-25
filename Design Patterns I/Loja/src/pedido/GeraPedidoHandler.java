package pedido;

import java.time.LocalDateTime;

import loja.orcamento.Orcamento;

/**
 * Command
 * 
 * Utilizado hoje em dia o CommandHandler, pois é multiplataforma, mas fácil reproveitar.
 * Seperação de dados com a separação dos comandos.
 * 
 * O padrão pretende  encapsular em um objeto todos os dados necessários 
 * para realizar uma determinada ação (comando), incluindo o método a ser chamado, os 
 * argumentos do método e o objeto ao qual o método pertence.

 * Esse modelo nos permite desacoplar objetos que produzem os comandos de seus consumidores, 
 * por isso o padrão é comumente conhecido como padrão produtor-consumidor.
 *
 */
public class GeraPedidoHandler {

	// Construtor com injeção de dependências: Repository, service
	
	

	public void execute(GeraPedido dados) {
		Orcamento orcamento = new Orcamento(dados.getValorOcamento(), dados.getQuantidadeItens());

		Pedido pedido = new Pedido(dados.getCliente(), LocalDateTime.now(), orcamento);

		System.out.println("Salvar pedido no banco de dados");
		System.out.println("Enviar email com dados do novo pedido");
	}

}
