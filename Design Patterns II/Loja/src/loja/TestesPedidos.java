package loja;

import java.math.BigDecimal;
import java.util.Arrays;

import loja.acao.EnviarEmailPedido;
import loja.acao.LogPedido;
import loja.acao.SalvarPedidoBanco;
import loja.pedido.GeraPedido;
import loja.pedido.GeraPedidoHandler;
/**
 * Facade
 * 
 * Fornecer acesso a uma pequena parte de um sistema, 
 * através de uma única classe, e que essa classe pode acabar utilizando várias 
 * outras classes desse "sub-sistema". Simplicidade.
 * 
 * Não expôr complexidade dos métodos, chama uma "fachada", melhora o acoplamento.
 * Código mais simples de utilizar.
 *
 * O método execue funciona como esta fachada. Só precisa chamar uma método no Handler.
 * 
 * Normalmente utiizada para chamada de várias classes.
 *
 */
public class TestesPedidos {

	public static void main(String[] args) {
		// O args do main estaria passando os dados via linha de comando
		
		String cliente = "Sarah";
		BigDecimal valorOrcamento = new BigDecimal("300");
		int quantidadeItens = Integer.parseInt("2");
		
		GeraPedido gerador = new GeraPedido(cliente, valorOrcamento, quantidadeItens);
		GeraPedidoHandler handler = new GeraPedidoHandler(Arrays.asList(new SalvarPedidoBanco(), 
				new EnviarEmailPedido(),
				new SalvarPedidoBanco(),
				new LogPedido()));
		handler.execute(gerador);
	
	}

}
