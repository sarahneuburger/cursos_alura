package loja.descontos;

import java.math.BigDecimal;

import loja.orcamento.Orcamento;

// Final da cadeia de aplicação de descontos
public class SemDesconto extends Descontos {

	public SemDesconto() {
		super(null);
	}

	@Override
	public boolean deveAplicar(Orcamento orcamento) {
		return true;
	}

	@Override
	protected BigDecimal efetuarCalculo(Orcamento orcamento) {
		return BigDecimal.ZERO;
	}

}
