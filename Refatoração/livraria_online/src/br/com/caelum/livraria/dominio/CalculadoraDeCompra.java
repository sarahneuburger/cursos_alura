package br.com.caelum.livraria.dominio;

import org.javamoney.moneta.Money;
/**
 * Remover atribui��es a par�metros
 * 
 * O par�metro subtotal era utilizado no lugar de resultado para calcular o valor final.
 * N�o � uma boa pr�tica atribuir valor � par�metros, logo foi refatorado para que a 
 * vari�vel resultado realize os devidos c�lculos.
 *
 */

public class CalculadoraDeCompra {
	
	// O valor do subtotal � alterado diversas vezes
	public Money calcularValorTotal(Money subtotal, Money valorDoFrete, Desconto desconto) {
		if(subtotal.isZero()) return subtotal;
		Money resultado = subtotal;
		resultado = resultado.subtract(desconto.getValor());
		resultado = resultado.add(valorDoFrete);
		return resultado;
	}
}
