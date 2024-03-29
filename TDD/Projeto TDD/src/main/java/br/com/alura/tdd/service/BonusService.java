package br.com.alura.tdd.service;

import java.math.BigDecimal;
import java.math.RoundingMode;

import br.com.alura.tdd.modelo.Funcionario;

public class BonusService {

	public BigDecimal calcularBonus(Funcionario funcionario) {
		BigDecimal valor = funcionario.getSalario().multiply(new BigDecimal("0.1"));
		if (valor.compareTo(new BigDecimal("1000")) > 0) {
			throw new IllegalArgumentException("Funcion�rio com sal�rio maior do que R$1000,00, n�o pode receber b�nus.");
		}
		// setScale, m�todo do BigDecimal para arredondar casas, o rounding � para onde, neste caso, para cima.
		return valor.setScale(2, RoundingMode.HALF_UP);
	}

}
