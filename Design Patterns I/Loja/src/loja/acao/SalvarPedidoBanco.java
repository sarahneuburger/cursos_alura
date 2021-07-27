package loja.acao;

import loja.pedido.Pedido;

public class SalvarPedidoBanco implements AcaoAposGerarPedido{
	
	public void executarAcao(Pedido pedido) {
		System.out.println("Sando dados do pedido no banco de dados.");
	}

}
