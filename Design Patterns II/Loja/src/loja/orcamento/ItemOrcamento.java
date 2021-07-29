package loja.orcamento;

import java.math.BigDecimal;

/**
 * Composite
 * 
 * Compor um objeto com outro.
 * Similar ao decorator.
 * Hierarquia de objetos.
 * Posso acessar o todo ou por objeto.
 *
 */
public class ItemOrcamento {

	private BigDecimal valor;

	public BigDecimal getValor() {
		return valor;
	}

	public ItemOrcamento(BigDecimal valor) {
		this.valor = valor;
	}
}
