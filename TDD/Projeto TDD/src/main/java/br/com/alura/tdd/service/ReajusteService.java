package br.com.alura.tdd.service;

import java.math.BigDecimal;

import br.com.alura.tdd.modelo.Desempenho;
import br.com.alura.tdd.modelo.Funcionario;

public class ReajusteService {

	public void concederReajuste(Funcionario func, Desempenho desempenho) {
		if(desempenho == Desempenho.A_DESEJAR) {
			BigDecimal reajuste = func.getSalario().multiply(new BigDecimal("0.03"));
			func.reajustarSalario(reajuste);
		}
		else if (desempenho == Desempenho.BOM) {
			BigDecimal reajuste = func.getSalario().multiply(new BigDecimal("0.15"));
			func.reajustarSalario(reajuste);
		}
		else if(desempenho == Desempenho.ÓTIMO) {
			BigDecimal reajuste = func.getSalario().multiply(new BigDecimal("0.20"));
			func.reajustarSalario(reajuste);
		}
	}

}
