package loja.descontos;

import java.math.BigDecimal;

import loja.orcamento.Orcamento;

/**
 * 
 *Chain of Resposability
 *
 *
 *
 */

public class CalculadoraDeDescontos {

	public BigDecimal calcular(Orcamento orcamento) {
		Descontos desconto = new DescontoParaOrcamentoMaisCincoItens(
				new DescontoParaOrcamentoMaiorQueQuinhentos(
						new SemDesconto()));
		return desconto.calcular(orcamento);
	}

}
