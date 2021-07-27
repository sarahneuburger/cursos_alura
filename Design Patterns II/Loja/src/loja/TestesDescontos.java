package loja;

import java.math.BigDecimal;

import loja.descontos.CalculadoraDeDescontos;
import loja.orcamento.Orcamento;

public class TestesDescontos {
	
	public static void main(String[] args) {
		
		Orcamento orcamento = new Orcamento(new BigDecimal(200), 6);
		Orcamento orcamento2 = new Orcamento(new BigDecimal(1000), 1);
		CalculadoraDeDescontos calculadoraDescontos = new CalculadoraDeDescontos();
		BigDecimal retorno = calculadoraDescontos.calcular(orcamento);
		BigDecimal retorno2 = calculadoraDescontos.calcular(orcamento2);
		System.out.println(retorno);
		System.out.println(retorno2);
		
	}

}
