package br.com.escola.infra.aluno;

import br.com.escola.aplicacao.aluno.matricular.MatricularAluno;
import br.com.escola.aplicacao.aluno.matricular.MatricularAlunoDTO;
/**
 * Representa a interface com o usuário
 *
 */
public class MatricularAlunoPorLinhaDeComando {

	public static void main(String[] args) {

		String nome = "Fulano";
		String cpf = "000.000.000-00";
		String email = "fulano@email.com";
		
		MatricularAluno matricular = new MatricularAluno(new RepositorioDeAlunosEmMemoria());
		matricular.executa(new MatricularAlunoDTO(nome, cpf, email));
	
	}

}
