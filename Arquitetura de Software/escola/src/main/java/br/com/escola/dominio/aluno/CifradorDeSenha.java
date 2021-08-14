package br.com.escola.dominio.aluno;
/**
 * Como ser� cifrado, n�o faz do dom�nio e sim da infra.
 * 
 * Representa um servi�o que pertence ao dom�nio.
 *
 */
public interface CifradorDeSenha {
	
	String cifrarSenha(String senha);
	
	boolean validarSenhaCifrada(String senhaCifrada, String senha);

}
