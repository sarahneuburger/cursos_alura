package br.com.caelum.eventos.dominio;


import static br.com.caelum.eventos.dominio.Atividade.ALMOCO;
import static br.com.caelum.eventos.dominio.Atividade.NETWORKING;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
/**
 * Extract Method
 * 
 * Técnica de refatoração para extrair trechos de um código que é repetido ou longo para um método
 * a parte. Basta selecionar o trecho, clicar com direito, selecionar Refactor e depois Extract Method.
 * Vai abrir uma tela para realizar as configurações do novo método, como nome, visibilidade e outros.
 * É possível ver um preview de como o método vai ficar e onde vai impactar no restante do código.
 * Neste exemplo, extraímos o agendarPalestra(), que se repetia em outros dois métodos.
 * Sempre rodar os testes unitários após a refatoração. Caso não hajam testes, fazer antes da
 * refatoração.
 * 
 * 
 * Internalizar variável temporária (tempoDeDuracaoEmMinutos)
 * 
 * É uma variável que não tem utilidade no restante do código, é chamada
 * somente nos loopings, neste caso do exemplo.
 * Clicar com o botão direito sobre a variável que será excluída, selecionar 
 * Refactor e depois Inline.
 * Virou este trecho de código plusMinutes(palestra.lerTempoDeDuracao().toInt();
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
