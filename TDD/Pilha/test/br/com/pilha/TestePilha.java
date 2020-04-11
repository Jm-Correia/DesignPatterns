package br.com.pilha;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import br.com.pilha.exception.PIlhaTamanhoMaximoAtingido;
import br.com.pilha.exception.PilhaVaziaException;

public class TestePilha {
	
	private Pilha p;
	
	@Before
	public void inicializaPIlha() {
		p = new Pilha(10);
	}
	
	@Test
	public void pilhaVazia() {
		assertTrue(p.isEmpty());
		assertEquals(0, p.getTamanho());
	}

	@Test
	public void empilhaUmElementro() {
		p.empilha("primeiro");
		assertFalse(p.isEmpty());
		assertEquals(1, p.getTamanho());
		assertEquals("primeiro", p.topo());
	}
	@Test
	public void empilhaAndDesempilha() {
		p.empilha("primeiro");
		p.empilha("segundo");
		assertFalse(p.isEmpty());
		assertEquals(2, p.getTamanho());
		assertEquals("segundo", p.topo());
		Object desempulhado = p.desempilha();
		assertEquals(1, p.getTamanho());
		assertEquals("primeiro", p.topo());
		assertEquals("segundo", desempulhado);
	}

	@Test(expected = PilhaVaziaException.class)
	public void removeDaPilhaVazia() {
		p.desempilha();
	}
	
	@Test
	public void addNaPilhaMaxima() {
		p = new Pilha(0);
		
		try {			
			p.empilha("boom");
			fail();
		}catch (PIlhaTamanhoMaximoAtingido e) {}
	}
	
}
