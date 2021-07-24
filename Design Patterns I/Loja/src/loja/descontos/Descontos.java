package loja.descontos;

import java.math.BigDecimal;

import loja.orcamento.Orcamento;

// Classe mãe dos descontos

/**
 * Template Method
 * 
 * Reaproveitar trechos de códigos comuns, evitando duplicações.
 * Método calcular está funcionando como um template, como modelo.
 * Faz parte do processo, mas outra parte ele delega.
 * Estipula a forma de calcular, mas quem define a regra de aplicação
 * é a classe filha.
 * Parte dos processos são iguais entre as classes filhas.
 * Métodos abstratos.
 * Deixa o código mais enxuto.
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
