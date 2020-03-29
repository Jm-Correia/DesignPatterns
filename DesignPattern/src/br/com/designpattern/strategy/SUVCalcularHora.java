package br.com.designpattern.strategy;
import br.com.designpattern.models.Ticket;

public class SUVCalcularHora implements CalculoStrategy {

	@Override
	public Double calcularHora(Ticket ticket) {
		// TODO Auto-generated method stub
		final long duracao = ticket.getSaida() - ticket.getEntrada();
		final Double valorHora = ticket.getCarro().getTipo().getValue() + (0.78 * duracao)/1000; 
		return valorHora;
	}

}
