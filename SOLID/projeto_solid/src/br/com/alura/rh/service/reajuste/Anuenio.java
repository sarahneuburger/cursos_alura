package br.com.alura.rh.service.reajuste;

import java.math.BigDecimal;
import java.time.LocalDate;

/**
 * Classe para exemplifica��o do Princ�pio de Segrega��o de Iterface. 
 * N�o impacta no restante do c�digo.
 *
 */
public class Anuenio implements Reajuste {

	private BigDecimal valor;
	private LocalDate data;
	
		
	public Anuenio(BigDecimal valor) {
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

	/**
	 * C�lcilo valor do IR, neste caso, � zero n�o faria sentido estar na interface Reajuste.
	 * Logo foi criada a classe ReajusteTributavel que estende da mesma e implementa
	 * o que for necess�rio. Segregando as interfaces e n�o obrigando a Anuenio a implementar
	 * algo que n�o precisa.
	 */

}
