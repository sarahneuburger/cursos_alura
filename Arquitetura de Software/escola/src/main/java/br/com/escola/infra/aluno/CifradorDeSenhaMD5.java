package br.com.escola.infra.aluno;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import br.com.escola.dominio.aluno.CifradorDeSenha;
/**
 * Exemplo de implementação do conceito de cifrar senha do domínio.
 * Faz parte da infra, essa implementação. Serviço de infraestrutura.
 *
 */
public class CifradorDeSenhaMD5 implements CifradorDeSenha {

	@Override
	public String cifrarSenha(String senha) {
		   try {
		        MessageDigest md = MessageDigest.getInstance("MD5");
		        byte[] array = md.digest(senha.getBytes());
		        StringBuffer sb = new StringBuffer();
		        for (int i = 0; i < array.length; ++i) {
		          sb.append(Integer.toHexString((array[i] & 0xFF) | 0x100).substring(1,3));
		       }
		        return sb.toString();
		    } catch (NoSuchAlgorithmException e) {
		    }
		    return null;
		}

	@Override
	public boolean validarSenhaCifrada(String senhaCifrada, String senha) {
		return senhaCifrada.equals(this.cifrarSenha(senha));
	}

}
