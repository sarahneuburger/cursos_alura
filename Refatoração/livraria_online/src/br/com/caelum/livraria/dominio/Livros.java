package br.com.caelum.livraria.dominio;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

import org.javamoney.moneta.Money;
/**
 * Substituir algortimo
 * 
 *  Nesse caso, visa proteger a nossa lista de livros, para que não ocorram alterações errôneas, 
 *  ou alterações que podem estragar nossa lista de livros de alguma forma, por exemplo, a gente 
 *  não quer que exista uma remoção de livros da lista de livros, aqui na nossa classe, só contém 
 *  métodos, aqui na nossa classe, que podem alterar a lista de livros, sem que quebre o comportamento 
 *  do sistema como um todo.
 *  
 * Pode ser aplicado por uma série de razões, você pode achar que 
 * o algoritmo que está sendo usado é lento, é confuso, ou a gente quer, 
 * simplesmente, utilizar algum recurso novo da nossa linguagem, que pode 
 * ser, comprovadamente, mais rápido ou mais legível.
 *
 */
public class Livros implements Iterable<Livro> { 
	
	private final List<Livro> lista;
	
	public Livros(Livro ... livros) {
		this.lista = Arrays.stream(livros)
				.collect(Collectors.toList());
	}
	
	public Money getSubtotal() {		
		return lista
				.stream()
				.map(Livro::getValor)
				.reduce(Money.of(0, Livraria.reais), Money::add);
	}

	@Override
	public Iterator<Livro> iterator() {
		return lista.iterator();
	}

	public void adicionar(Livro livro) {
		this.lista.add(livro);
	}
}
