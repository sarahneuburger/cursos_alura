package br.com.caelum.livraria.dominio;

import org.javamoney.moneta.Money;
/**
 * Remover atribuições a parâmetros
 * 
 * O parâmetro subtotal era utilizado no lugar de resultado para calcular o valor final.
 * Não é uma boa prática atribuir valor à parâmetros, logo foi refatorado para que a 
 * variável resultado realize os devidos cálculos.
 *
 */

public class CalculadoraDeCompra {
	
	// O valor do subtotal é alterado diversas vezes
	public Money calcularValorTotal(Money subtotal, Money valorDoFrete, Desconto desconto) {
		if(subtotal.isZero()) return subtotal;
		Money resultado = subtotal;
		resultado = resultado.subtract(desconto.getValor());
		resultado = resultado.add(valorDoFrete);
		return resultado;
	}
}
