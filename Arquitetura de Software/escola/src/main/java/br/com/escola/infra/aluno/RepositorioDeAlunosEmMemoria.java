package br.com.escola.infra.aluno;

import java.util.ArrayList;
import java.util.List;

import br.com.escola.dominio.aluno.Aluno;
import br.com.escola.dominio.aluno.CPF;
import br.com.escola.dominio.aluno.RepositorioDeAlunos;
/**
 * A iterface no dom�nio pode ter m�ltiplas implementa��es de infra, seja
 * mem�ria, banco, arquivo, etc.
 * A camada de dom�nio deve estar desacoplada da infra.
 */
public class RepositorioDeAlunosEmMemoria implements RepositorioDeAlunos {
	
	private List<Aluno> matriculados = new ArrayList<>();

	@Override
	public void matricular(Aluno aluno) {
		this.matriculados.add(aluno);
	}

	@Override
	public Aluno buscarPorCPF(CPF cpf) {
		return this.matriculados.stream().filter(a -> a.getCpf().equals(cpf.getNumero()))
				.findFirst()
				.orElseThrow( () -> new RuntimeException());
	}

	@Override
	public List<Aluno> listarTodosAlunosMatriculados() {
		return this.matriculados;
	}

}
