package br.com.escola.infra.aluno;

import br.com.escola.dominio.aluno.Aluno;
import br.com.escola.dominio.indicacao.EnviarEmailIndicacao;

public class EnviarEmailIndicacaoComJavaMail implements EnviarEmailIndicacao {

	@Override
	public void enviarPara(Aluno indicado) {
		// L�gica de envio de emails com a lib java mail
		
	}

}
