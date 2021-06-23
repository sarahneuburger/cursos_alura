package br.com.alura.rh.service.reajuste;

import java.math.BigDecimal;
import java.util.List;

import br.com.alura.rh.model.Funcionario;

public class ReajusteService {
	
	/**
	 * Invers�o de depend�ncia
	 * 
	 * Abstra��es n�o devem depender de implementa��es. E sim as implementa��es
	 * das abstra��es (interfaces).
	 */
	
	private List<ValidacaoReajuste> validacoes;
	public ReajusteService(List<ValidacaoReajuste> validacoes) {
		this.validacoes = validacoes;
	}
	/** 
	 * Facilmente extens�vel para novas valida��es
	 * Regras de neg�cio para o sal�rio
	 * Tudo que � referente a ajuste salarial entre nesta classe
	 * Mudan�a das regras impacta somente nesta classe.
	 */
	public void reajustarSalarioDoFuncionario(Funcionario funcionario, BigDecimal aumento) {
		this.validacoes.forEach(v -> v.validar(funcionario, aumento));
		BigDecimal salarioAjustado = funcionario.getDadosPessoais().getSalario().add(aumento);
		funcionario.atualizarSalario(salarioAjustado);
		}

}
