package br.com.escola.dominio.aluno;
/**
 * Como será cifrado, não faz do domínio e sim da infra.
 * 
 * Representa um serviço que pertence ao domínio.
 *
 */
public interface CifradorDeSenha {
	
	String cifrarSenha(String senha);
	
	boolean validarSenhaCifrada(String senhaCifrada, String senha);

}
