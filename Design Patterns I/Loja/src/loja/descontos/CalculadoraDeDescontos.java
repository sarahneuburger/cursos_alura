package loja.descontos;

import java.math.BigDecimal;

import loja.orcamento.Orcamento;

/**
 * 
 * Chain of Resposability
 *
 * N�o sabemos de cara qual desconto dever� ser aplicado. Neste caso, precisa
 * ser verificado cada caso. Uma classe que possui a assinatura do desconto e a
 * vari�vel para setar o pr�ximo desconto que ser� verificado, via construtor.
 * 
 * O padr�o conhecido como Chain Of Responsibility, corrente de responsabilidades 
 * onde eu tenho uma corrente, uma sequ�ncia, um fluxo de responsabilidades e eu 
 * vou verificando qual delas precisa ser aplicada. Se uma n�o for aplicada, ele 
 * est� ligado e tem um elo com a pr�xima e ele vai chamar a pr�xima. Se for aplicada, 
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
