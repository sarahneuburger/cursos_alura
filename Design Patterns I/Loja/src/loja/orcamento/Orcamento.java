package loja.orcamento;

import java.math.BigDecimal;

public class Orcamento {
	
	private BigDecimal valor;
	
	private int quantidadeItens;
	
	public BigDecimal getValor() {
		return valor;
	}

	public Orcamento(BigDecimal valor, int quantidadeItens) {
		this.valor = valor;
		this.quantidadeItens = quantidadeItens;
	}



	public int getQuantidadeItens() {
		return quantidadeItens;
	}
	

}
