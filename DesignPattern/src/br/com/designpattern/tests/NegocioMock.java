package br.com.designpattern.tests;

import br.com.designpattern.proxy.AcessoInterface;

public class NegocioMock implements AcessoInterface {

	private boolean foiAcessado = false;
	
	@Override
	public void executarTransacao() {
		// TODO Auto-generated method stub
		foiAcessado = true;
	}

	@Override
	public void cancelarTransacao() {
		// TODO Auto-generated method stub
		foiAcessado = true;
	}

	public boolean foiAcessado() {
		return foiAcessado;
	}

	
}
