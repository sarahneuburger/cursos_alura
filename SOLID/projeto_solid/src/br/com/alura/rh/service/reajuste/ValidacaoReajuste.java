package br.com.alura.rh.service.reajuste;

import java.math.BigDecimal;

import br.com.alura.rh.model.Funcionario;

/**
 * Quando os métodos repetem assinatura, devemos implementar interface.
 * Utilizada nas classes {@link ValidacaoPercentualReajuste} e 
 * {@link ValidacaoPeriodicidadeEntreAjustes}.
 * 
 * Princípio aberto - fechado
 * Abertas para extensão e fechadas para modificação.
 * 
 * Cada classe deve conhecer e ser responsável por suas próprias regras de negócio;
 * 
 * Devemos poder criar novas funcionalidades e estender o sistema sem precisar modificar 
 * muitas classes já existentes.
 * 
 * Uma classe que tende a crescer "para sempre" é uma forte candidata a sofrer alguma espécie 
 * de refatoração.
 *
 */
public interface ValidacaoReajuste {
	
	// As classes entre si, não conhecem umas as outras. Fácil manutenção.
	void validar(Funcionario funcionario, BigDecimal aumento);
}
