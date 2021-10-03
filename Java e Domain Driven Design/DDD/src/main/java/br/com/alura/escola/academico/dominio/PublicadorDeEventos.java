package br.com.alura.escola.academico.dominio;

import java.util.ArrayList;
import java.util.List;

import br.com.alura.escola.academico.dominio.evento.Evento;
import br.com.alura.escola.academico.dominio.evento.Ouvinte;

public class PublicadorDeEventos {

	
	private List<Ouvinte> ouvintes = new ArrayList<>();
	
	public void adicionar(Ouvinte ouvinte) {
		ouvintes.add(ouvinte);
	}
	
	public void publicar(Evento evento) {
		this.ouvintes.forEach(o -> {
			o.processa(evento);
		});
	}
}
