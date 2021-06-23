package br.com.alura.rh.service.reajuste;

import java.math.BigDecimal;
import java.util.List;

import br.com.alura.rh.model.Funcionario;

public class ReajusteService {
	
	/**
	 * Inversão de dependência
	 * 
	 * Abstrações não devem depender de implementações. E sim as implementações
	 * das abstrações (interfaces).
	 */
	
	private List<ValidacaoReajuste> validacoes;
	public ReajusteService(List<ValidacaoReajuste> validacoes) {
		this.validacoes = validacoes;
	}
	/** 
	 * Facilmente extensível para novas validações
	 * Regras de negócio para o salário
	 * Tudo que é referente a ajuste salarial entre nesta classe
	 * Mudança das regras impacta somente nesta classe.
	 */
	public void reajustarSalarioDoFuncionario(Funcionario funcionario, BigDecimal aumento) {
		this.validacoes.forEach(v -> v.validar(funcionario, aumento));
		BigDecimal salarioAjustado = funcionario.getDadosPessoais().getSalario().add(aumento);
		funcionario.atualizarSalario(salarioAjustado);
		}

}
