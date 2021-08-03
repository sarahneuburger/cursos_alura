package br.com.caelum.livraria.dominio;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

import org.javamoney.moneta.Money;
/**
 * Substituir algortimo
 * 
 *  Nesse caso, visa proteger a nossa lista de livros, para que n�o ocorram altera��es err�neas, 
 *  ou altera��es que podem estragar nossa lista de livros de alguma forma, por exemplo, a gente 
 *  n�o quer que exista uma remo��o de livros da lista de livros, aqui na nossa classe, s� cont�m 
 *  m�todos, aqui na nossa classe, que podem alterar a lista de livros, sem que quebre o comportamento 
 *  do sistema como um todo.
 *  
 * Pode ser aplicado por uma s�rie de raz�es, voc� pode achar que 
 * o algoritmo que est� sendo usado � lento, � confuso, ou a gente quer, 
 * simplesmente, utilizar algum recurso novo da nossa linguagem, que pode 
 * ser, comprovadamente, mais r�pido ou mais leg�vel.
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
