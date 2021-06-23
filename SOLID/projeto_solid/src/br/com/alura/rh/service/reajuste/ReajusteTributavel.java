package br.com.alura.rh.service.reajuste;
/**
 * Classe para exemplificação do Princípio de Segregação de Iterface. 
 * Não impacta no restante do código.
 * 
 * Uma classe não pode ser forçada a depender de métodos que não utilizará.
 * 
 * Os métodos da interface não farão sentido para todas as classes.
 * 
 * Essa classe herda o reajuste normal.
 *
 */

import java.math.BigDecimal;

public interface ReajusteTributavel extends Reajuste {
	
	BigDecimal valorImpostoRenda();

}
