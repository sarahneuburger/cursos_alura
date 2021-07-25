package pedido;

import java.time.LocalDateTime;

import loja.orcamento.Orcamento;

/**
 * Command
 * 
 * Utilizado hoje em dia o CommandHandler, pois � multiplataforma, mas f�cil reproveitar.
 * Sepera��o de dados com a separa��o dos comandos.
 * 
 * O padr�o pretende  encapsular em um objeto todos os dados necess�rios 
 * para realizar uma determinada a��o (comando), incluindo o m�todo a ser chamado, os 
 * argumentos do m�todo e o objeto ao qual o m�todo pertence.

 * Esse modelo nos permite desacoplar objetos que produzem os comandos de seus consumidores, 
 * por isso o padr�o � comumente conhecido como padr�o produtor-consumidor.
 *
 */
public class GeraPedidoHandler {

	// Construtor com inje��o de depend�ncias: Repository, service
	
	

	public void execute(GeraPedido dados) {
		Orcamento orcamento = new Orcamento(dados.getValorOcamento(), dados.getQuantidadeItens());

		Pedido pedido = new Pedido(dados.getCliente(), LocalDateTime.now(), orcamento);

		System.out.println("Salvar pedido no banco de dados");
		System.out.println("Enviar email com dados do novo pedido");
	}

}
