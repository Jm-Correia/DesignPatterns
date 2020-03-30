package br.com.designpattern.tests;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.junit.Test;

import br.com.designpattern.models.Usuario;
import br.com.designpattern.proxy.AcessoInterface;
import br.com.designpattern.proxy.SegurancaNegocio;

public class TestSegurancaProxy {

	
	@Test
	public void testeAutorizaAcesso() {
		Usuario joao = new Usuario("Joao");
		joao.autorizaAcesso("AcessoInterface","executarTransacao");
		NegocioMock mock = new NegocioMock();
		AcessoInterface acesso = new SegurancaNegocio(mock, joao);
		acesso.executarTransacao();
		assertTrue(mock.foiAcessado());
	}
	
	@Test
	public void testeNaoAutorizaAcesso() {
		Usuario joao = new Usuario("Joao");
		joao.autorizaAcesso("AcessoInterface","executarTransacao");
		NegocioMock mock = new NegocioMock();
		AcessoInterface acesso = new SegurancaNegocio(mock, joao);
		try {
			acesso.cancelarTransacao();
			fail();
		}catch (Exception e) {
			assertFalse(mock.foiAcessado());
		}
	}
	
}
