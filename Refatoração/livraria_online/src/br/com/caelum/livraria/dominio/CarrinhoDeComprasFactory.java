package br.com.caelum.livraria.dominio;
/**
 * Ocultar dele��o
 * 
 * Exposi��o indevido de atributos para outros objetos.
 * � criado o acesso seguro a esses dados.
 * 
 * Aplicado no m�todo adicionar no CarrinhoDeCompras, ainda era acesso diretamente 
 * em um atributo da classe.
 */
import static java.time.LocalDate.now;

import java.util.HashSet;
import java.util.Set;

import org.javamoney.moneta.Money;

public class CarrinhoDeComprasFactory {

	private final Set<CarrinhoDeCompras> carrinhos;

	public CarrinhoDeComprasFactory() {
		this.carrinhos = new HashSet<>();
	}

	public CarrinhoDeCompras obterCarrinho(Cliente cliente, Livro livro, Money valorFrete) {
		CarrinhoDeCompras carrinho = new CarrinhoDeCompras(cliente, livro, valorFrete, now());
		if (carrinhos.contains(carrinho)) {
			carrinho = carrinhos.stream().filter(umCarrinho -> umCarrinho.doCliente(cliente)).findFirst().orElse(null);
			if (carrinho != null)
				carrinho.adicionar(livro);
		} else
			carrinhos.add(carrinho);
		return carrinho;
	}
}
