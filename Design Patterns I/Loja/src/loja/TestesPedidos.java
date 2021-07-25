package loja;

import java.math.BigDecimal;

import pedido.GeraPedido;
import pedido.GeraPedidoHandler;

public class TestesPedidos {

	public static void main(String[] args) {
		// O args do main estaria passando os dados via linha de comando
		
		String cliente = args[0];
		BigDecimal valorOrcamento = new BigDecimal(args[1]);
		int quantidadeItens = Integer.parseInt(args[2]);
		
		GeraPedido gerador = new GeraPedido(cliente, valorOrcamento, quantidadeItens);
		GeraPedidoHandler handler = new GeraPedidoHandler(/*dependências*/);
		handler.execute(gerador);
	
	}

}
