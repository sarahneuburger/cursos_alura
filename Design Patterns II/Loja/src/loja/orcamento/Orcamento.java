package loja.orcamento;

import java.math.BigDecimal;

import loja.orcamento.situacao.EmAnalise;
import loja.orcamento.situacao.Finalizado;
import loja.orcamento.situacao.SituacaoOrcamento;

public class Orcamento {

	private BigDecimal valor;

	private int quantidadeItens;

	private SituacaoOrcamento situacao;

	public BigDecimal getValor() {
		return valor;
	}
	
	public boolean isFinalizado() {
		return situacao instanceof Finalizado;
	}

	public Orcamento(BigDecimal valor, int quantidadeItens) {
		this.valor = valor;
		this.quantidadeItens = quantidadeItens;
		this.situacao = new EmAnalise();
	}

	public void aplicarDescontoExtra() {
		BigDecimal valorDoDescontoExtra = this.situacao.calcularValorDescontoExtra(this);
		this.valor = this.valor.subtract(valorDoDescontoExtra);
	}

	public void aprovar() {
		this.situacao.aprovar(this);
	}

	public void reprovar() {
		this.situacao.reprovar(this);
	}

	public void finalizar() {
		this.situacao.finalizar(this);
	}

	public int getQuantidadeItens() {
		return quantidadeItens;
	}

	public void setSituacao(SituacaoOrcamento situacao) {
		this.situacao = situacao;
	}

	public SituacaoOrcamento getSituacao() {
		return situacao;
	}

}
