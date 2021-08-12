package br.com.escola.dominio.aluno;

import java.util.List;
/**
 * Dom�nio tamb�m tem no��o de persist�cia, mas n�o dos detalhes.
 * 
 * Implementa��o fica fora do dom�nio.
 */
public interface RepositorioDeAlunos {
	
	void matricular(Aluno aluno);
	
	Aluno buscarPorCPF(CPF cpf);
	
	List<Aluno> listarTodosAlunosMatriculados();
	
	//...

}
