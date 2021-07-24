package loja.orcamento.situacao;

import java.math.BigDecimal;

import loja.orcamento.Orcamento;
/**
 * State
 * 
 * Similar ao Strategy.
 * Transição de estados ou regras baseadas em estados.
 * If situação tal, faça desse jeito...
 * 
 * Regra de transição de estados.
 * Aplicado no desconto extra.
 * 
 * Classe abstrata, funciona como modelo.
 * Cada transição herda desta classe e sobrescreve os comportamnetos
 * necessários.
 *
 */

public class SituacaoOrcamento {
	
	public BigDecimal calcularValorDescontoExtra(Orcamento orcamento) {
		return BigDecimal.ZERO;
	}
	
	public void aprovar(Orcamento orcamento) {
		throw new DomainException("Orçcamento não pode ser aprovado.");
	}
	
	public void reprovar(Orcamento orcamento) {
		throw new DomainException("Orçcamento não pode ser reprovado.");
	}
	
	public void finalizar(Orcamento orcamento) {
		throw new DomainException("Orçcamento não pode ser finalizado.");
	}

}
