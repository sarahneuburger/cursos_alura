package br.com.caelum.eventos.dominio;


import static br.com.caelum.eventos.dominio.Atividade.ALMOCO;
import static br.com.caelum.eventos.dominio.Atividade.NETWORKING;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
/**
 * Extract Method
 * 
 * T�cnica de refatora��o para extrair trechos de um c�digo que � repetido ou longo para um m�todo
 * a parte. Basta selecionar o trecho, clicar com direito, selecionar Refactor e depois Extract Method.
 * Vai abrir uma tela para realizar as configura��es do novo m�todo, como nome, visibilidade e outros.
 * � poss�vel ver um preview de como o m�todo vai ficar e onde vai impactar no restante do c�digo.
 * Neste exemplo, extra�mos o agendarPalestra(), que se repetia em outros dois m�todos.
 * Sempre rodar os testes unit�rios ap�s a refatora��o. Caso n�o hajam testes, fazer antes da
 * refatora��o.
 * 
 * 
 * Internalizar vari�vel tempor�ria (tempoDeDuracaoEmMinutos)
 * 
 * � uma vari�vel que n�o tem utilidade no restante do c�digo, � chamada
 * somente nos loopings, neste caso do exemplo.
 * Clicar com o bot�o direito sobre a vari�vel que ser� exclu�da, selecionar 
 * Refactor e depois Inline.
 * Virou este trecho de c�digo plusMinutes(palestra.lerTempoDeDuracao().toInt();
 * Refatorada na linha 50.
 *
 */
public class Trilha {
	
	private final String nome;
	private final List<Atividade> atividadesAgendadas;
	
	public Trilha(String nome, SessaoDaManha sessaoDaManha, SessaoDaTarde sessaoDaTarde){
		this.nome = nome;
		atividadesAgendadas = new ArrayList<>();

		LocalTime horarioCalculado = sessaoDaManha.comecaAs();
		for(Palestra palestra : sessaoDaManha){
			agendarPalestra(horarioCalculado, palestra);
			horarioCalculado = horarioCalculado.plusMinutes(palestra.lerTempoDeDuracao().toInt());
		}
		agendarAlmoco();
		
		horarioCalculado = sessaoDaTarde.comecaAs();
		for(Palestra palestra : sessaoDaTarde){
			agendarPalestra(horarioCalculado, palestra);
			horarioCalculado = horarioCalculado.plusMinutes(palestra.lerTempoDeDuracao().toInt());
		}
		agendarNetworking();
	}

	private void agendarPalestra(LocalTime horarioCalculado, Palestra palestra) {
		palestra.agendarPara(horarioCalculado);
		atividadesAgendadas.add(palestra);
	}
	
	private void agendarNetworking() {
		atividadesAgendadas.add(NETWORKING);
	}

	private void agendarAlmoco(){
		atividadesAgendadas.add(ALMOCO);
	}
	
	public String nome(){
		return "Trilha " + nome;
	}

	public List<Atividade> lerAtividadesAgendadasEmOrdem() {
		return atividadesAgendadas;
	}
}
