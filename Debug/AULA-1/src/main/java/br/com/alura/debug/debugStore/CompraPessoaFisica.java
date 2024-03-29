package br.com.alura.debug.debugStore;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import br.com.alura.debug.debugStore.modelo.CarrinhoCompra;
import br.com.alura.debug.debugStore.modelo.Categoria;
import br.com.alura.debug.debugStore.modelo.FormaPagamento;
import br.com.alura.debug.debugStore.modelo.Produto;
/**
 * 
 * Curso Debug 
 * 
 * Step Into (F5): entra no método em que o debug está parado.
 *
 * Step Over (F6): vai para a próxima linha de código.
 *
 * Step Return (F7): retorna ao método anterior e só funciona quando o Step Into é acionado antes.
 *
 * Breakpoint condicional - botão direito sobre o breakpoint - breakpoint preferences -
 * Assinalar check para condicional - preencher condição
 * 
 * Por padrão, o debug para em exceções não tratadas, porém, é uma opção pode ser marcada
 * nas preferências da IDE. Pode escolher para parar somente nas exceções necessárias.
 * Na tela de breakpoints, existe uma opção (Add java exception breakpoint) onde é cadastrada 
 * a classe da exceção que será condição para parar o debug.
 *
 */
public class CompraPessoaFisica {
	
	public static void main(String[] args) {
		Categoria informatica = new Categoria("Informatica");
		List<Produto> produtos = criarProdutos(informatica);
		CarrinhoCompra carrinho = new CarrinhoCompra(FormaPagamento.BOLETO);
		BigDecimal valorFinalDaCompra = carrinho.calcularPrecoFinal(produtos);
		System.out.println("Valor da compra: " + valorFinalDaCompra);
	}

	

	private static List<Produto> criarProdutos(Categoria categoria) {
		List<Produto> produtos = new ArrayList<Produto>();
		Produto mouse = new Produto("Mouse sem fio Microsoft",new BigDecimal(("120")), categoria);
		produtos.add(mouse);
		Produto teclado = new Produto("Teclado de Gamer Alien", new BigDecimal("350"), categoria);
		produtos.add(teclado);
		Produto monitor = new Produto("Monitor Lg 17 Widescreen", new BigDecimal("250"), categoria);
		produtos.add(monitor);
		Produto processador = new Produto("Processador Intel Core I7", new BigDecimal("1500"), categoria);
		produtos.add(processador);
		Produto cadeira = new Produto("Cadeira Racing Gamer", new BigDecimal("759"), categoria);
		produtos.add(cadeira);
		return produtos;
	}
	
}
