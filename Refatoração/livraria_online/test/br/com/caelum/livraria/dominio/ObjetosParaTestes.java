package br.com.caelum.livraria.dominio;

public class ObjetosParaTestes {
	
	public static final String CEP = "03297060";
	public static final String ID_CLIENTE = "idCliente";
	public static final String UM_DDD = "11";
	public static final String UM_NUMERO = "55555555";
	public static final Cliente UM_CLIENTE = new Cliente("idCliente", UM_DDD, UM_NUMERO, CEP);
	public static final Cliente OUTRO_CLIENTE = new Cliente("outroIdCliente", UM_DDD, UM_NUMERO, CEP);
	public static final Autor umAutor = new Autor("Rodrigo vieira");
}
