package loja.orcamento.situacao;

import java.math.BigDecimal;

import loja.orcamento.Orcamento;
/**
 * State
 * 
 * Similar ao Strategy.
 * Transi��o de estados ou regras baseadas em estados.
 * If situa��o tal, fa�a desse jeito...
 * 
 * Regra de transi��o de estados.
 * Aplicado no desconto extra.
 * 
 * Classe abstrata, funciona como modelo.
 * Cada transi��o herda desta classe e sobrescreve os comportamnetos
 * necess�rios.
 *
 */

public class SituacaoOrcamento {
	
	public BigDecimal calcularValorDescontoExtra(Orcamento orcamento) {
		return BigDecimal.ZERO;
	}
	
	public void aprovar(Orcamento orcamento) {
		throw new DomainException("Or�camento n�o pode ser aprovado.");
	}
	
	public void reprovar(Orcamento orcamento) {
		throw new DomainException("Or�camento n�o pode ser reprovado.");
	}
	
	public void finalizar(Orcamento orcamento) {
		throw new DomainException("Or�camento n�o pode ser finalizado.");
	}

}
