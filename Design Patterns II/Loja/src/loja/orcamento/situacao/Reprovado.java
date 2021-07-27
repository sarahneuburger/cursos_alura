package loja.orcamento.situacao;

import loja.orcamento.Orcamento;

public class Reprovado extends SituacaoOrcamento {

	
	public void finalizar(Orcamento orcamento) {
		orcamento.setSituacao(new Finalizado());
	}
}
