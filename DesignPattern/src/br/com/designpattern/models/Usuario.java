package br.com.designpattern.models;

import java.util.ArrayList;
import java.util.List;

public class Usuario {

	private String nome;
	private List<String> permissoes;
	
	public Usuario(String nome) {
		super();
		this.nome = nome;
		permissoes = new ArrayList<>();
	}

	public void autorizaAcesso(String classe, String metodo) {
		// TODO Auto-generated method stub
		permissoes.add(classe+":"+metodo);
	}

	public List<String> getPermissoes() {
		return permissoes;
	}
	
	
}
