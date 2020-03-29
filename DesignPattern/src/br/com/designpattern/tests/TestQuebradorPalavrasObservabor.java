package br.com.designpattern.tests;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import br.com.designpattern.observer.ContadorPalavrasPares;
import br.com.designpattern.observer.ContadorPalavrasSimples;
import br.com.designpattern.observer.ContadorPalavrasUpper;
import br.com.designpattern.observer.QuebradorPalavra;

public class TestQuebradorPalavrasObservabor {
	
	private static String PARES = "PARES";
	private static String SIMPLES = "SIMPLES";
	private static String UPPER = "UPPER";

	@Test
	void quebradorPalavras() {
		String frase = "O rato roeu a roupa do rei";
		
		QuebradorPalavra quebrador  = new QuebradorPalavra();
		String[] palavras = quebrador.quebrar(frase);
		assertEquals(7, palavras.length);
	}

	@Test
	void contarPalavrasSimples() {
		String frase = "O rato roeu a roupa do rei";
		QuebradorPalavra quebrador  = new QuebradorPalavra();
		quebrador.adicionarObservador(SIMPLES, new ContadorPalavrasSimples());
		quebrador.quebrar(frase);
		assertEquals(7, quebrador.getContagem(SIMPLES));
	}
	
	@Test
	void contarPalavrasPares() {
		String frase = "O rato roeu a roupa do rei";
		QuebradorPalavra quebrador  = new QuebradorPalavra();
		quebrador.adicionarObservador(PARES, new ContadorPalavrasPares());
		quebrador.quebrar(frase);
		assertEquals(3, quebrador.getContagem(PARES));
	}
	
	@Test
	void contarPalavrasUpperCase() {
		String frase = "O Rato Roeu a Roupa do Rei";
		QuebradorPalavra quebrador  = new QuebradorPalavra();
		quebrador.adicionarObservador(UPPER, new ContadorPalavrasUpper());
		quebrador.quebrar(frase);
		assertEquals(5, quebrador.getContagem(UPPER));
	}
}
