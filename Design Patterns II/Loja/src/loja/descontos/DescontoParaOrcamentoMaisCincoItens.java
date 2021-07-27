package loja.descontos;

import java.math.BigDecimal;

import loja.orcamento.Orcamento;

public class DescontoParaOrcamentoMaisCincoItens extends Descontos {

	public DescontoParaOrcamentoMaisCincoItens(Descontos proximo) {
		super(proximo);
	}

	@Override
	public boolean deveAplicar(Orcamento orcamento) {
		return orcamento.getQuantidadeItens() > 5;
	}

	@Override
	protected BigDecimal efetuarCalculo(Orcamento orcamento) {
		return orcamento.getValor().multiply(new BigDecimal("0.1"));
	}

}
