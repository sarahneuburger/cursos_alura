package br.com.alura.rh.service.reajuste;

import java.math.BigDecimal;
import java.time.LocalDate;
/**
 * Implementa somente a ReajusteTributavel que herda de Reajuste, 
 * tendo todos os m�todos necess�rios para a promo��o.
 *
 */
public class Promocao implements ReajusteTributavel {

	private BigDecimal valor;
	private LocalDate data;

	public Promocao(BigDecimal valor) {
		this.valor = valor;
		this.data = LocalDate.now();
	}

	@Override
	public BigDecimal valor() {
		return valor;
	}

	@Override
	public LocalDate data() {
		return data;
	}

	// Valor do IR � 10%
	@Override
	public BigDecimal valorImpostoRenda() {
		return valor.multiply(new BigDecimal("0.1"));
	}

}
