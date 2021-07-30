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
 * atrav�s de uma �nica classe, e que essa classe pode acabar utilizando v�rias 
 * outras classes desse "sub-sistema". Simplicidade.
 * 
 * N�o exp�r complexidade dos m�todos, chama uma "fachada", melhora o acoplamento.
 * C�digo mais simples de utilizar.
 *
 * O m�todo execue funciona como esta fachada. S� precisa chamar uma m�todo no Handler.
 * 
 * Normalmente utiizada para chamada de v�rias classes.
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
