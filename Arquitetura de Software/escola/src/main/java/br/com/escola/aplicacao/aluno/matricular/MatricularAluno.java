package br.com.escola.aplicacao.aluno.matricular;

import br.com.escola.dominio.aluno.Aluno;
import br.com.escola.dominio.aluno.RepositorioDeAlunos;
/**
 * Use case
 * 
 * Camada da aplicação
 *
 */
public class MatricularAluno {
	
	private final RepositorioDeAlunos repositorio;

	public MatricularAluno(RepositorioDeAlunos repositorio) {
		this.repositorio = repositorio;
	}
	
	// Lembra o design Command
	public void executa(MatricularAlunoDTO dto) {
		Aluno novo = dto.criarAluno();
		repositorio.matricular(novo);
		
	}
}
