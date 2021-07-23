package loja.descontos;

import java.math.BigDecimal;

import loja.orcamento.Orcamento;
// Classe mãe dos descontos
public abstract class Descontos {

	protected Descontos proximo;

	public Descontos(Descontos proximo) {
		super();
		this.proximo = proximo;
	}
	
	public abstract BigDecimal calcular(Orcamento orcamento);
}
