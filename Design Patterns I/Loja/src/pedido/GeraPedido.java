package pedido;

import java.math.BigDecimal;

public class GeraPedido {
	
	private String cliente;
	private BigDecimal valorOcamento;
	private int quantidadeItens;
	
	// Injecao de dependência: PedidoRepository, EmailService
	public GeraPedido(String cliente, BigDecimal valorOcamento, int quantidadeItens) {
		super();
		this.cliente = cliente;
		this.valorOcamento = valorOcamento;
		this.quantidadeItens = quantidadeItens;
	}
	
	public String getCliente() {
		return cliente;
	}

	public void setCliente(String cliente) {
		this.cliente = cliente;
	}

	public BigDecimal getValorOcamento() {
		return valorOcamento;
	}

	public void setValorOcamento(BigDecimal valorOcamento) {
		this.valorOcamento = valorOcamento;
	}

	public int getQuantidadeItens() {
		return quantidadeItens;
	}

	public void setQuantidadeItens(int quantidadeItens) {
		this.quantidadeItens = quantidadeItens;
	}
	
	
	

}
