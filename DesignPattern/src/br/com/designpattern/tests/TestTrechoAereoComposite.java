package br.com.designpattern.tests;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

import br.com.designpattern.composite.Trecho;
import br.com.designpattern.composite.TrechoAereo;
import br.com.designpattern.composite.TrechoAereoConexao;
import br.com.designpattern.composite.TrechoAereoEscala;

public class TestTrechoAereoComposite {

	@Test
	public void trechoComEscala() {
		TrechoAereo t1 = new TrechoAereo("REC", "MIA", 550, 8);
		TrechoAereo t2 = new TrechoAereo("MIA", "IND", 70, 3);
		Trecho escala = new TrechoAereoEscala(t1, t2);
		assertEquals("IND", escala.getDestino());
		assertEquals(620, escala.getCusto());
		assertEquals(11, escala.getDuracao());
	}
	
	@Test(expected = RuntimeException.class)
	public void trechoComEscalaEntreAeroportosDiferentes() {
		TrechoAereo t1 = new TrechoAereo("REC", "MIA", 550, 8);
		TrechoAereo t2 = new TrechoAereo("FLL", "IND", 70, 3);
		new TrechoAereoEscala(t1, t2);
	}
	
	@Test
	public void trechoComConexao() {
		TrechoAereo t1 = new TrechoAereo("REC", "MIA", 550, 8);
		TrechoAereo t2 = new TrechoAereo("MIA", "IND", 70, 3);
		Trecho conexao = new TrechoAereoConexao(t1, t2, 80);
		assertEquals("IND", conexao.getDestino());
		assertEquals(700, conexao.getCusto());
		assertEquals(11, conexao.getDuracao());
	}
	
}
