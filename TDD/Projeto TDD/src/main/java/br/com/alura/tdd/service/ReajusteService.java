package br.com.alura.tdd.service;

import java.math.BigDecimal;

import br.com.alura.tdd.modelo.Desempenho;
import br.com.alura.tdd.modelo.Funcionario;

public class ReajusteService {
	
	// Padr�o strategy, � uma estrat�gia de reajuste, que varia de acordo com o desempenho
	// Mas a base � a mesma

	// Criado no enum, um m�todo que j� retorno o valor do reajuste de acordo com a escolha
	// Elimina os if else
	public void concederReajuste(Funcionario func, Desempenho desempenho) {
			BigDecimal percentual = desempenho.percentualReajuste();
			BigDecimal reajuste = func.getSalario().multiply(percentual);
			func.reajustarSalario(reajuste);
	}

}
