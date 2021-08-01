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
 * Internalizar métodos
 * 
 * Seleciona o método a ser internalizado, clicar com o direito Refactor
 * e depois Inline. Escolher a forma que será aplicada, somente naquele trecho
 * ou em todas as inovações do método.
 * 
 * Unifica as funcionalidades de um método em outro. Utilizado em lerPalestra().
 * Inverso do Extract Method, onde um trecho é extraído para outro método que continua
 * sendo invocado no método original. No Inline, os métodos são mesclados, o outro deixa
 * de existir.
 * 
 * 
 * Substituir variável temporária por consulta
 * 
 * As variáveis recebiam o valor de dois métodos que foram extraídos 
 * lerNomePalestra e lerTempoDuracaoPalestra, após essa extração dos métodos
 * foram subtituídas as variáveis que chamavam estes métods com o Refactor 
 * Inline, logo, não existem mais essas variáveis internas, somente as 
 * chamados dos métodos. Linhas 59, 61 e 63.
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
