package br.com.tradutor;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TesteTradutor {

	private Tradutor t;
	
	@Before
	public void inicializador() {
		t = new Tradutor();
	}
	
	@Test
	public void tradutorSemPalavras() {
		t = new Tradutor();
		assertTrue(t.isVazio());
	}
	
	@Test
	public void umTraducao() {
		t = new Tradutor();
		t.adicionaTraducao("bom", "good");
		assertFalse(t.isVazio());
		assertEquals("good", t.traduzir("bom"));
	}
	
	@Test
	public void duasTraducoes() {
		t = new Tradutor();
		t.adicionaTraducao("bom", "good");
		t.adicionaTraducao("ruim", "bad");
		assertFalse(t.isVazio());
		assertEquals("good", t.traduzir("bom"));
		assertEquals("bad", t.traduzir("ruim"));
	}
	
	@Test
	public void duasTraducoesMesmaPalavra() {
		t = new Tradutor();
		t.adicionaTraducao("bom", "good");
		t.adicionaTraducao("bom", "nice");
		assertFalse(t.isVazio());
		assertEquals("good, nice", t.traduzir("bom"));
	}
	
	
	@Test
	public void traduzirFrase() {
		t = new Tradutor();
		t.adicionaTraducao("covid", "Covid-19");
		t.adicionaTraducao("é", "is");
		t.adicionaTraducao("ruim", "bad");
		assertFalse(t.isVazio());
		assertEquals("Covid-19 is bad", t.traduzirFrase("covid é ruim"));
	}
	
	@Test
	public void traduzirFraseComDuasTraducoes() {
		t = new Tradutor();
		t.adicionaTraducao("covid", "Covid-19");
		t.adicionaTraducao("covid", "Corona Virus");
		t.adicionaTraducao("é", "is");
		t.adicionaTraducao("ruim", "bad");
		assertFalse(t.isVazio());
		assertEquals("Covid-19 is bad", t.traduzirFrase("covid é ruim"));
	}

}
