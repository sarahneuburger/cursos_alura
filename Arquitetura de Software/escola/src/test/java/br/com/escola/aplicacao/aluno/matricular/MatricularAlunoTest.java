package br.com.escola.aplicacao.aluno.matricular;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import br.com.escola.dominio.aluno.Aluno;
import br.com.escola.dominio.aluno.CPF;
import br.com.escola.infra.aluno.RepositorioDeAlunosEmMemoria;

class MatricularAlunoTest {

	@Test
	void alunoDeveriaSerPersistido() {
		RepositorioDeAlunosEmMemoria repositorio = new RepositorioDeAlunosEmMemoria();
		MatricularAluno useCase = new MatricularAluno(repositorio);

		MatricularAlunoDTO dados = new MatricularAlunoDTO("Fulano", "88899977744", "fulano@email.com");
		useCase.executa(dados);
		
		Aluno encontrado = repositorio.buscarPorCPF(new CPF("88899977744"));
		assertEquals("Fulano", encontrado.getNome());
		assertEquals("88899977744", encontrado.getCpf());
		assertEquals("fulano@email.com", encontrado.getEmail());
	}

}
