package br.com.designpattern.strategy;

import br.com.designpattern.models.Ticket;

public class Pagamento {

	private CalculoStrategy calcularHora;
	private Ticket ticket;
	
	public Pagamento(CalculoStrategy calcularHora, Ticket ticket) {
		super();
		this.calcularHora = calcularHora;
		this.ticket = ticket;
	}
	
	
	public Double realizarPagamento() {
		return calcularHora.calcularHora(ticket);
	}


	public Ticket getTicket() {
		return ticket;
	}
	
	
	
}
