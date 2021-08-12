package br.com.escola.dominio.aluno;

import java.util.List;
/**
 * Domínio também tem noção de persistêcia, mas não dos detalhes.
 * 
 * Implementação fica fora do domínio.
 */
public interface RepositorioDeAlunos {
	
	void matricular(Aluno aluno);
	
	Aluno buscarPorCPF(CPF cpf);
	
	List<Aluno> listarTodosAlunosMatriculados();
	
	//...

}
