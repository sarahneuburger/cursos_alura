package loja.descontos;

import java.math.BigDecimal;

import loja.orcamento.Orcamento;

// Final da cadeia de aplicação de descontos
public class SemDesconto extends Descontos {

	public SemDesconto() {
		super(null);
	}

	@Override
	public BigDecimal calcular(Orcamento orcamento) {
		return BigDecimal.ZERO;
	}

}
