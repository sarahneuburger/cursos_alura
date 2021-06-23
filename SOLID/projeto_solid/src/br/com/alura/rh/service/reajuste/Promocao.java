package br.com.alura.rh.service.reajuste;

import java.math.BigDecimal;
import java.time.LocalDate;
/**
 * Implementa somente a ReajusteTributavel que herda de Reajuste, 
 * tendo todos os métodos necessários para a promoção.
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

	// Valor do IR é 10%
	@Override
	public BigDecimal valorImpostoRenda() {
		return valor.multiply(new BigDecimal("0.1"));
	}

}
