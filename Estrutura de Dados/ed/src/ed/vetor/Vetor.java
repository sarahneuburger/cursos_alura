package ed.vetor;

import java.util.Arrays;

public class Vetor {

	private Aluno[] alunos = new Aluno[100];
	private int totalDeAlunos = 0;

	// Inserir um aluno depende do tamanho da lista. Fica mais demorado conforme a
	// lista tem
	// mais objetos. Adicionado contador para já ter a posição livre armazenada
	public void adicionar(Aluno aluno) {
//		for (int i = 0; i < alunos.length; i++) {
//			if(alunos[i] == null) {
//				alunos[i] = aluno;
//				break;
//			}
//			
//		}
		// Leva tempo constante, idependente da quantidade de dados no Array
		// Performance será sempre a mesma
		this.alunos[totalDeAlunos] = aluno;
		totalDeAlunos++;
	}

	private boolean posicaoValida(int posicao) {
		return posicao >= 0 && posicao <= totalDeAlunos;
	}

	// Para inserir em posição específica, é preciso pegar todos que estavam a
	// partir da mesma e
	// empurrar para a direita
	// Também O(N), pois o tamanho da lista influencia
	public void adicionar(Aluno aluno, int posicao) {
		this.garanteEspaco(); // Irá validar o tamanho antes de adicionar
		if (!posicaoValida(posicao)) {
			throw new IllegalArgumentException("Posição inválida");
		}

		for (int i = totalDeAlunos - 1; i == posicao; i -= 1) {
			alunos[i + 1] = alunos[i];
		}
		alunos[posicao] = aluno;
		totalDeAlunos++;
	}

	private boolean posicaoOcupada(int posicao) {
		return posicao >= 0 && posicao < totalDeAlunos;
	}

	public Aluno pega(int posicao) {
		if (!posicaoOcupada(posicao)) {
			throw new IllegalArgumentException("Posicação ocupada.");
		}
		return alunos[posicao];
	}

	// Não há opção além de percorrer o array
	// Só vai varrer o array até a posição que sabemos que tem alunos
	// Tempo de execução varia pela quantidade de elementos O(N)
	public boolean contem(Aluno aluno) {
		for (int i = 0; i < totalDeAlunos; i++) {
			if (aluno.equals(alunos[i]))
				return true;
		}
		return false;
	}

	public int tamanho() {
		return totalDeAlunos;
	}

	public String toString() {
		return Arrays.toString(alunos);
	}

	public void remove(int posicao) {
		for (int i = posicao; i < totalDeAlunos; i++) {
			alunos[i] = alunos[i + 1];
		}
	}
	
	// Irá criar um novo array para garantir o novo cadastre caso ultrapasse 100 alunos.
	// Do ponto de vista de performance, é correto dobrar o tamanho
	private void garanteEspaco() {
		if(totalDeAlunos == alunos.length) {
			Aluno[] novoArray = new Aluno[alunos.length*2];
			for (int i = 0; i < alunos.length; i++) {
				novoArray[i] = alunos[i];
			}
			this.alunos = novoArray;
		}
	}

}
