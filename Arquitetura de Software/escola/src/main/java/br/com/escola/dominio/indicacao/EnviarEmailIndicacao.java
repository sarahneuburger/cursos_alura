package br.com.escola.dominio.indicacao;

import br.com.escola.dominio.aluno.Aluno;
/**
 * Service de envio de email na camada da aplicação.
 * Detalhes de implementação fica na infra.
 *
 */
public interface EnviarEmailIndicacao {
	
	void enviarPara(Aluno indicado);

}
