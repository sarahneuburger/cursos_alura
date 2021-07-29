package loja.orcamento;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import loja.orcamento.situacao.EmAnalise;
import loja.orcamento.situacao.Finalizado;
import loja.orcamento.situacao.SituacaoOrcamento;

public class Orcamento implements Orcavel {

	private BigDecimal valor;
	private SituacaoOrcamento situacao;
	private List<ItemOrcamento> itens = new ArrayList<>();

	public BigDecimal getValor() {
		return valor;
	}
	
	public boolean isFinalizado() {
		return situacao instanceof Finalizado;
	}

	public Orcamento() {
		this.valor = BigDecimal.ZERO;
		this.itens = new ArrayList<>();
		this.situacao = new EmAnalise();
	}
	
	public void adicionarItem (ItemOrcamento item) {
		this.valor = valor.add(item.getValor());
		this.itens.add(item);
		
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
		return itens.size();
	}

	public void setSituacao(SituacaoOrcamento situacao) {
		this.situacao = situacao;
	}

	public SituacaoOrcamento getSituacao() {
		return situacao;
	}

}
