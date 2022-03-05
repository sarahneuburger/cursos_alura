package ed;

public class VetorTeste {

	public static void main(String[] args) {
		Aluno a1 = new Aluno("João");
		Aluno a2 = new Aluno("Marta");

		Vetor lista = new Vetor();

		System.out.println(lista.tamanho());
		lista.adicionar(a1);
		System.out.println(lista.tamanho());
		lista.adicionar(a2);
		System.out.println(lista.tamanho());
		System.out.println(lista.contem(a2));

		System.out.println(lista);

		Aluno a3 = new Aluno("Maria");
		System.out.println(lista.contem(a3));

		// System.out.println(lista.pega(110));

		lista.adicionar(a3, 1);
		System.out.println(lista);

		lista.remove(1);
		System.out.println(lista);
	}

}
