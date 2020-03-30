package br.com.designpattern.proxy;

import br.com.designpattern.models.Usuario;

public class SegurancaNegocio implements AcessoInterface {

	private AcessoInterface encapsulado;
	private Usuario u;

	public SegurancaNegocio(AcessoInterface encapsulado, Usuario u) {
		super();
		this.encapsulado = encapsulado;
		this.u = u;
	}

	public void executarTransacao() {
		if(u.getPermissoes().contains("AcessoInterface:executarTransacao")) {
			encapsulado.executarTransacao();
		}else {
			throw new RuntimeException();
		}
	}

	public void cancelarTransacao() {
		if(u.getPermissoes().contains("AcessoInterface:cancelarTransacao")) {
			encapsulado.cancelarTransacao();
		}else {
			throw new RuntimeException();
		}
	}
	
	

}
