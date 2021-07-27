package loja;

import java.math.BigDecimal;
import java.util.Arrays;

import loja.acao.EnviarEmailPedido;
import loja.acao.SalvarPedidoBanco;
import loja.pedido.GeraPedido;
import loja.pedido.GeraPedidoHandler;

public class TestesPedidos {

	public static void main(String[] args) {
		// O args do main estaria passando os dados via linha de comando
		
		String cliente = "Sarah";
		BigDecimal valorOrcamento = new BigDecimal("300");
		int quantidadeItens = Integer.parseInt("2");
		
		GeraPedido gerador = new GeraPedido(cliente, valorOrcamento, quantidadeItens);
		GeraPedidoHandler handler = new GeraPedidoHandler(Arrays.asList(new SalvarPedidoBanco(), 
				new EnviarEmailPedido()));
		handler.execute(gerador);
	
	}

}
