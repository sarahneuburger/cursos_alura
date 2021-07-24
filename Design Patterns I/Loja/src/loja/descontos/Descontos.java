package loja.descontos;

import java.math.BigDecimal;

import loja.orcamento.Orcamento;

// Classe m�e dos descontos

/**
 * Template Method
 * 
 * Reaproveitar trechos de c�digos comuns, evitando duplica��es.
 * M�todo calcular est� funcionando como um template, como modelo.
 * Faz parte do processo, mas outra parte ele delega.
 * Estipula a forma de calcular, mas quem define a regra de aplica��o
 * � a classe filha.
 * Parte dos processos s�o iguais entre as classes filhas.
 * M�todos abstratos.
 * Deixa o c�digo mais enxuto.
 *
 */
public abstract class Descontos {

	protected Descontos proximo;

	public Descontos(Descontos proximo) {
		super();
		this.proximo = proximo;
	}

	public BigDecimal calcular(Orcamento orcamento) {
		if(deveAplicar(orcamento)) {
			return efetuarCalculo(orcamento);
		}
		return proximo.calcular(orcamento);
	
	}

	protected abstract BigDecimal efetuarCalculo(Orcamento orcamento);

	protected abstract boolean deveAplicar(Orcamento orcamento);
}
