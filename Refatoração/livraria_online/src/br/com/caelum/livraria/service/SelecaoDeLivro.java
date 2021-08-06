package br.com.caelum.livraria.service;

import org.javamoney.moneta.Money;

import br.com.caelum.livraria.dominio.CalculadoraFrete;
import br.com.caelum.livraria.dominio.CarrinhoDeCompras;
import br.com.caelum.livraria.dominio.CarrinhoDeComprasFactory;
import br.com.caelum.livraria.dominio.Cliente;
import br.com.caelum.livraria.dominio.ISBN;
import br.com.caelum.livraria.dominio.Livro;
import br.com.caelum.livraria.dominio.TodosLivros;
/**
 * Mover campo
 * 
 * Movido o campo cep para o objeto Cliente, onde faz mais sentido.
 * 
 * ---
 * 
 * Extrair classes
 * 
 * Métodos/classes não devem ter muitas rensabilidades, logo, será dividido
 * as responsabilidades com outra classe (CarrinhoDeComprasFactory).
 *
 */
public class SelecaoDeLivro {
	
	private final TodosLivros todosLivros;
	private final CalculadoraFrete calculadoraFrete;
	private final CarrinhoDeComprasFactory comprasFactory;
	
	
	public SelecaoDeLivro(TodosLivros todosLivros, CalculadoraFrete calculadoraFrete) {
		this.todosLivros = todosLivros;
		this.calculadoraFrete = calculadoraFrete;
		this.comprasFactory = new CarrinhoDeComprasFactory();
	}

	public CarrinhoDeCompras adicionarLivroNoCarrinhoDoCliente(ISBN isbn, Cliente cliente) {
		Livro livro = todosLivros.por(isbn);
		Money valorFrete = calculadoraFrete.baseadoEm(cliente.getCep());
		
		CarrinhoDeCompras carrinho = comprasFactory.obterCarrinho(cliente, livro, valorFrete);
		return carrinho;
	}


}
