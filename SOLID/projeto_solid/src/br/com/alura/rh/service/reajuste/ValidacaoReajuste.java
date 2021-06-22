package br.com.alura.rh.service.reajuste;

import java.math.BigDecimal;

import br.com.alura.rh.model.Funcionario;

/**
 * Quando os m�todos repetem assinatura, devemos implementar interface.
 * Utilizada nas classes {@link ValidacaoPercentualReajuste} e 
 * {@link ValidacaoPeriodicidadeEntreAjustes}.
 * 
 * Princ�pio aberto - fechado
 * Abertas para extens�o e fechadas para modifica��o.
 * 
 * Cada classe deve conhecer e ser respons�vel por suas pr�prias regras de neg�cio;
 * 
 * Devemos poder criar novas funcionalidades e estender o sistema sem precisar modificar 
 * muitas classes j� existentes.
 * 
 * Uma classe que tende a crescer "para sempre" � uma forte candidata a sofrer alguma esp�cie 
 * de refatora��o.
 *
 */
public interface ValidacaoReajuste {
	
	// As classes entre si, n�o conhecem umas as outras. F�cil manuten��o.
	void validar(Funcionario funcionario, BigDecimal aumento);
}
