package br.com.alura.rh.service.reajuste;
/**
 * Classe para exemplifica��o do Princ�pio de Segrega��o de Iterface. 
 * N�o impacta no restante do c�digo.
 * 
 * Uma classe n�o pode ser for�ada a depender de m�todos que n�o utilizar�.
 * 
 * Os m�todos da interface n�o far�o sentido para todas as classes.
 */

import java.math.BigDecimal;
import java.time.LocalDate;

public interface Reajuste {
	
	BigDecimal valor();
	LocalDate data();

}
