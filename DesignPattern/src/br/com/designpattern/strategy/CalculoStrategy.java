package br.com.designpattern.strategy;

import br.com.designpattern.models.Ticket;

public interface CalculoStrategy {

	Double calcularHora(Ticket ticket);
	
}
