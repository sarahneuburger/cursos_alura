package loja.descontos;

import java.math.BigDecimal;

import loja.orcamento.Orcamento;

public class DescontoParaOrcamentoMaiorQueQuinhentos extends Descontos {

	public DescontoParaOrcamentoMaiorQueQuinhentos(Descontos proximo) {
		super(proximo);
	}

	@Override
	public boolean deveAplicar(Orcamento orcamento) {
		return orcamento.getValor().compareTo(new BigDecimal("500")) > 0;
	}

	@Override
	protected BigDecimal efetuarCalculo(Orcamento orcamento) {
		return orcamento.getValor().multiply(new BigDecimal("0.05"));
	}

}
