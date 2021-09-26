package java8;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Streams {

	public static void main(String[] args) {

		List<Curso> cursos = new ArrayList<Curso>();
		cursos.add(new Curso("Python", 45));
		cursos.add(new Curso("JavaScript", 150));
		cursos.add(new Curso("Java 8", 113));
		cursos.add(new Curso("C", 55));

		cursos.sort(Comparator.comparing(Curso::getNome));
		cursos.forEach(c -> System.out.println(c.getNome()));

		System.out.println("--------");

		// Filtrar cursos com mais de 100 alunos
		// Stream, filter
		// Fluxo, sequência de eventos, formas de trabalhar com objetos
		// Tudo que é feito no stream não impacta a lista original
		cursos.stream()//
				.filter(c -> c.getAlunos() >= 100)//
				.forEach(c -> System.out.println(c.getNome()));

		System.out.println("--------");

		// Mapear os dados para outra coisa, no caso um mapper
		// Filtrou e mostrou a quantidade de alunos de cada curso com mais de 100
		cursos.stream()//
				.filter(c -> c.getAlunos() >= 100)//
				.map(Curso::getAlunos).forEach(total -> System.out.println(total));

		System.out.println("--------");

		// Mapeando dados para int, que possui seus próprios metodos, exemplo sum
		// É possível armazenar o resultado
		int sum = cursos.stream()//
				.filter(c -> c.getAlunos() >= 100)//
				.mapToInt(Curso::getAlunos)//
				.sum();
		System.out.println(sum);

		System.out.println("--------");

		// Retorna os cursos encontrados, conforme filtro, em Optional
		cursos.stream()//
				.filter(c -> c.getAlunos() >= 100)//
				.findAny()//
				.ifPresent(c -> System.out.println(c.getNome()));

		System.out.println("--------");

		// Com a ação collect, é possível usar a classe Collectors para jogar os
		// resultados para
		// uma lista, map, etc..
		List<Curso> list = cursos.stream()//
				.filter(c -> c.getAlunos() >= 100)//
				.collect(Collectors.toList());

		System.out.println("--------");

		Map<String, Integer> map = cursos.stream()//
				.filter(c -> c.getAlunos() >= 100)//
				.collect(Collectors.toMap(c -> c.getNome(), c -> c.getAlunos()));
		System.out.println(map);

		System.out.println("--------");

		cursos.stream()//
				.filter(c -> c.getAlunos() >= 100)//
				.collect(Collectors.toMap(c -> c.getNome(), c -> c.getAlunos()))//
				.forEach((nome, alunos) -> System.out.println(nome + " tem " + alunos + " alunos."));

		// Encontra o primeiro registro, conforme filtro
		cursos.stream().filter(c -> c.getAlunos() > 50).findFirst();

		// Calcula a média dos alunos
		cursos.stream().mapToInt(c -> c.getAlunos()).average();
	}

}

class Curso {
	private String nome;
	private int alunos;

	public Curso(String nome, int alunos) {
		this.nome = nome;
		this.alunos = alunos;
	}

	public String getNome() {
		return nome;
	}

	public int getAlunos() {
		return alunos;
	}
}