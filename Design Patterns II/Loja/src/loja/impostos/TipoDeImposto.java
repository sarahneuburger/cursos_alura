package loja.impostos;

import java.math.BigDecimal;

import loja.orcamento.Orcamento;

/**
 * Decorator
 * 
 * Decorando um objeto com outro objeto.
 * Composi��o de objetos que altera o comportamento inicial.
 * 
 * Neste caso, um imposto chama o pr�ximo.
 * 
 * � flex�vel, novos comportamentos sem precisar alterar toda a implemneta��o.
 *
 */
public abstract class TipoDeImposto {
	
	private TipoDeImposto outro;
	
	public TipoDeImposto(TipoDeImposto outro) {
		super();
		this.outro = outro;
	}

	protected abstract BigDecimal realizarCalculo(Orcamento orcamento);
	
	public BigDecimal calcular(Orcamento orcamento) {
		BigDecimal valorImposto = realizarCalculo(orcamento);
		BigDecimal valorOutroImposto = BigDecimal.ZERO;
		if(outro != null) {
			valorOutroImposto = outro.realizarCalculo(orcamento);
		}
		return valorImposto.add(valorOutroImposto);
	}

}
