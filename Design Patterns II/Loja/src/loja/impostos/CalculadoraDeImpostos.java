package loja.impostos;

import java.math.BigDecimal;

import loja.orcamento.Orcamento;
/**
 * Strategy
 * 
 * Algoritmo que variam de acordo com uma situa��o, no estilo if/swith.
 * Implementa��o de diversas classes que possuem o comportamento similiar.
 * Uso de interface.
 * 
 * estrat�gia. Ent�o a ideia � sempre que eu tenho um algoritmo, valida��o, 
 * c�lculo ou seja l� qual for essa regra e ela varia de acordo com um 
 * determinado par�metro, de acordo com determinado tipo de informa��o n�s 
 * costumamos ter esse c�digo cheio de if e else. 
 *
 */
public class CalculadoraDeImpostos {

	public BigDecimal calcular(Orcamento orcamento, TipoDeImposto tipoImposto) {
		return tipoImposto.calcular(orcamento);
	}
}
