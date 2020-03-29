package br.com.designpattern.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import br.com.designpattern.enumeration.TipoCarro;
import br.com.designpattern.models.Carro;
import br.com.designpattern.models.Ticket;
import br.com.designpattern.strategy.Pagamento;
import br.com.designpattern.strategy.SUVCalcularHora;
import br.com.designpattern.strategy.SmallCalcularHora;

class TestPagamentoStrategy {

	@Test
	void pagamentoSuv() {
		final Carro hilux = new Carro("pgt-0422", 'R', "TOYOTA", TipoCarro.SUV);
		
		Ticket ticketHilux = new Ticket(1423, 3620, hilux);

		Pagamento pagamento = new Pagamento(new SUVCalcularHora(), ticketHilux);
		
		assertEquals(9.71366, pagamento.realizarPagamento());
	}
	
	@Test
	void pagamentoSuvHora() {
		final Carro hilux = new Carro("pgt-0422", 'R', "TOYOTA", TipoCarro.SUV);
		
		Ticket ticketHilux = new Ticket(144569, 3620, hilux);

		Pagamento pagamento = new Pagamento(new SUVCalcularHora(), ticketHilux);
		
		assertNotEquals(101.94022, pagamento.realizarPagamento());
	}
	
	@Test
	void pagamentoSmall() {
		final Carro mobi = new Carro("kkk-2332", 'B', "FIAT", TipoCarro.COMPACT);
		final Ticket ticket = new Ticket(3500, 6500, mobi);
		Pagamento pg = new Pagamento(new SmallCalcularHora(), ticket);
		
		assertEquals(4.84, pg.realizarPagamento());
	}

}
