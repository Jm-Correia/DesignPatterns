package br.com.designpattern.strategy;

import br.com.designpattern.models.Ticket;

public class CaminhaoCacularHora implements CalculoStrategy {

	@Override
	public Double calcularHora(Ticket ticket) {
		
		final Double valor = ticket.getCarro().getTipo().getValue() + (2.5 * ticket.getDuracao())/1000;
		
		return valor;
	}

}
