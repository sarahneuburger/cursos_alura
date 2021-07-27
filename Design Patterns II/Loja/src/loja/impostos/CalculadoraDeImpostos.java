package loja.impostos;

import java.math.BigDecimal;

import loja.orcamento.Orcamento;
/**
 * Strategy
 * 
 * Algoritmo que variam de acordo com uma situação, no estilo if/swith.
 * Implementação de diversas classes que possuem o comportamento similiar.
 * Uso de interface.
 * 
 * estratégia. Então a ideia é sempre que eu tenho um algoritmo, validação, 
 * cálculo ou seja lá qual for essa regra e ela varia de acordo com um 
 * determinado parâmetro, de acordo com determinado tipo de informação nós 
 * costumamos ter esse código cheio de if e else. 
 *
 */
public class CalculadoraDeImpostos {

	public BigDecimal calcular(Orcamento orcamento, TipoDeImposto tipoImposto) {
		return tipoImposto.calcular(orcamento);
	}
}
