package br.com.designpattern.strategy;

import br.com.designpattern.models.Ticket;

public class SmallCalcularHora implements CalculoStrategy {

	@Override
	public Double calcularHora(Ticket ticket) {
		// TODO Auto-generated method stub
		
		if(ticket.getDuracao() < 20) {
			return 0.0;
		}
		
		final Double valor = ticket.getCarro().getTipo().getValue() + (0.28 * ticket.getDuracao())/1000;
		
		return valor;
	}

}
