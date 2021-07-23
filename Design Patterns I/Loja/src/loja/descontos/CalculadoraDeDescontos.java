package loja.descontos;

import java.math.BigDecimal;

import loja.orcamento.Orcamento;

/**
 * 
 * Chain of Resposability
 *
 * Não sabemos de cara qual desconto deverá ser aplicado. Neste caso, precisa
 * ser verificado cada caso. Uma classe que possui a assinatura do desconto e a
 * variável para setar o próximo desconto que será verificado, via construtor.
 * 
 * O padrão conhecido como Chain Of Responsibility, corrente de responsabilidades 
 * onde eu tenho uma corrente, uma sequência, um fluxo de responsabilidades e eu 
 * vou verificando qual delas precisa ser aplicada. Se uma não for aplicada, ele 
 * está ligado e tem um elo com a próxima e ele vai chamar a próxima. Se for aplicada, 
 * aplicou e encerrou o assunto. 
 *
 */

public class CalculadoraDeDescontos {

	public BigDecimal calcular(Orcamento orcamento) {
		Descontos desconto = new DescontoParaOrcamentoMaisCincoItens(
				new DescontoParaOrcamentoMaiorQueQuinhentos(new SemDesconto()));
		return desconto.calcular(orcamento);
	}

}
