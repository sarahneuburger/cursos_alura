package br.com.alura.rh.service.reajuste;

import java.math.BigDecimal;
import java.time.LocalDate;

/**
 * Classe para exemplificação do Princípio de Segregação de Iterface. 
 * Não impacta no restante do código.
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
	 * Cálcilo valor do IR, neste caso, é zero não faria sentido estar na interface Reajuste.
	 * Logo foi criada a classe ReajusteTributavel que estende da mesma e implementa
	 * o que for necessário. Segregando as interfaces e não obrigando a Anuenio a implementar
	 * algo que não precisa.
	 */

}
