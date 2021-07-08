package br.com.alura.tdd.service;

import java.math.BigDecimal;

import br.com.alura.tdd.modelo.Desempenho;
import br.com.alura.tdd.modelo.Funcionario;

public class ReajusteService {
	
	// Padrão strategy, é uma estratégia de reajuste, que varia de acordo com o desempenho
	// Mas a base é a mesma

	// Criado no enum, um método que já retorno o valor do reajuste de acordo com a escolha
	// Elimina os if else
	public void concederReajuste(Funcionario func, Desempenho desempenho) {
			BigDecimal percentual = desempenho.percentualReajuste();
			BigDecimal reajuste = func.getSalario().multiply(percentual);
			func.reajustarSalario(reajuste);
	}

}
