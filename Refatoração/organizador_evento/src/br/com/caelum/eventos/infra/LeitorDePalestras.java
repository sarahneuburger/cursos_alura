package br.com.caelum.eventos.infra;

import static br.com.caelum.eventos.dominio.TempoDeDuracao.LIGHTING_STRING;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import br.com.caelum.eventos.dominio.ListaDePalestras;
import br.com.caelum.eventos.dominio.Palestra;
import br.com.caelum.eventos.dominio.TempoDeDuracao;
/**
 * Internalizar m�todos
 * 
 * Seleciona o m�todo a ser internalizado, clicar com o direito Refactor
 * e depois Inline. Escolher a forma que ser� aplicada, somente naquele trecho
 * ou em todas as inova��es do m�todo.
 * 
 * Unifica as funcionalidades de um m�todo em outro. Utilizado em lerPalestra().
 * Inverso do Extract Method, onde um trecho � extra�do para outro m�todo que continua
 * sendo invocado no m�todo original. No Inline, os m�todos s�o mesclados, o outro deixa
 * de existir.
 * 
 * 
 * Substituir vari�vel tempor�ria por consulta
 * 
 * As vari�veis recebiam o valor de dois m�todos que foram extra�dos 
 * lerNomePalestra e lerTempoDuracaoPalestra, ap�s essa extra��o dos m�todos
 * foram subtitu�das as vari�veis que chamavam estes m�tods com o Refactor 
 * Inline, logo, n�o existem mais essas vari�veis internas, somente as 
 * chamados dos m�todos. Linhas 59, 61 e 63.
 * 
 *
 */
public class LeitorDePalestras {

	private final File arquivoDePalestras;
	
	public LeitorDePalestras(File arquivoDePalestras) {
		this.arquivoDePalestras = arquivoDePalestras;
	}

	public ListaDePalestras lerPalestras() throws FileNotFoundException {
		Set<Palestra> ret = new HashSet<>();
		try(Scanner scanner = new Scanner(arquivoDePalestras)){
			while(scanner.hasNextLine()){
				Palestra palestra = lerPalestra(scanner);
				ret.add(palestra);
			}
		}
		return new ListaDePalestras(ret);
	}

	private Palestra lerPalestra(Scanner scanner) {
		String linha = scanner.nextLine();
		int indiceDaDivisaoEntreNomeETempo = linha.lastIndexOf(' ');
		
		TempoDeDuracao duracao = LIGHTING_STRING.contains(lerTempoDuracaoPalestra(linha, indiceDaDivisaoEntreNomeETempo)) 
				? TempoDeDuracao.LIGHTING 
				: new TempoDeDuracao(Integer.valueOf(lerTempoDuracaoPalestra(linha, indiceDaDivisaoEntreNomeETempo)));
		
		return new Palestra(lerNomePalestra(linha, indiceDaDivisaoEntreNomeETempo), duracao);
	}

	private String lerTempoDuracaoPalestra(String linha, int indiceDaDivisaoEntreNomeETempo) {
		return linha.substring(indiceDaDivisaoEntreNomeETempo + 1, linha.length() - 3);
	}

	private String lerNomePalestra(String linha, int indiceDaDivisaoEntreNomeETempo) {
		return linha.substring(0, indiceDaDivisaoEntreNomeETempo);
	}
}
