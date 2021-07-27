package loja.http;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Map;

public class JavaHttpClient implements HttpAdapter {

	@Override
	public void post(String url, Map<String, Object> dados) {
		try {
			URL urlAPI = new URL(url);
			URLConnection connection = null;
			try {
				connection = urlAPI.openConnection();
			} catch (IOException e) {
				e.printStackTrace();
			}
			try {
				connection.connect();
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		} catch (MalformedURLException e) {
			throw new RuntimeException("Erro ao enviar requisição Http", e);
		
		}
	}

}
