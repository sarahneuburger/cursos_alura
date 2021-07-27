package loja;

import java.math.BigDecimal;

import loja.impostos.CalculadoraDeImpostos;
import loja.impostos.ICMS;
import loja.orcamento.Orcamento;

public class TestesLoja {
	
	public static void main(String[] args) {
		
		Orcamento orcamento = new Orcamento(new BigDecimal("100"), 6);
		CalculadoraDeImpostos calculadoraDeImpostos = new CalculadoraDeImpostos();
		BigDecimal retorno = calculadoraDeImpostos.calcular(orcamento, new ICMS());
		System.out.println(retorno);
		
	}

}
