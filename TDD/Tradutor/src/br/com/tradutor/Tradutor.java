package br.com.tradutor;

import java.util.HashMap;
import java.util.Map;

public class Tradutor {
	
	private Map<String, String> traducoes = new HashMap<String, String>();;

	public boolean isVazio() {
		return (traducoes.isEmpty());
	}

	public void adicionaTraducao(String palavra, String traducao) {
		if(traducoes.containsKey(palavra)) {
			traducao = traduzir(palavra) + ", "+ traducao;
		}
		this.traducoes.put(palavra, traducao);
	}

	public String traduzir(String palavra) {
		// TODO Auto-generated method stub
		return traducoes.get(palavra);
	}

	public String traduzirFrase(String frase) {
		String fraseTraduzida = "";
		for(String key: frase.split(" ")) {
			String aux = " ";	
			if(traducoes.containsKey(key)) {
				String traducao = primeiraTraducao(key);
				fraseTraduzida += traducao + aux;
			}
			aux = "";
		}
		
		
		return fraseTraduzida.trim();
	}

	private String primeiraTraducao(String key) {
		String traducao = traduzir(key);
		if(traducao.contains(",")) {
			traducao = traducao.substring(0, traducao.indexOf(","));
		}
		return traducao;
	}
	
}
