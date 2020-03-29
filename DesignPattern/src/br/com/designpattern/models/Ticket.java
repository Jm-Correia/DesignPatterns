package br.com.designpattern.models;

public class Ticket {

	private int id;
	private long entrada;
	private long saida;
	private Carro carro;
	
	public Ticket(long entrada, long saida, Carro carro) {
		super();
		this.entrada = entrada;
		this.saida = saida;
		this.carro = carro;
	}
	public long getEntrada() {
		return entrada;
	}
	public void setEntrada(long entrada) {
		this.entrada = entrada;
	}
	public long getSaida() {
		return saida;
	}
	public void setSaida(long saida) {
		this.saida = saida;
	}
	public Carro getCarro() {
		return carro;
	}
	public void setCarro(Carro carro) {
		this.carro = carro;
	}

	public long getDuracao() {
		return this.saida - this.entrada;
		
	}
	
	
	public int getId() {
		return id;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((carro == null) ? 0 : carro.hashCode());
		result = prime * result + (int) (entrada ^ (entrada >>> 32));
		result = prime * result + (int) (saida ^ (saida >>> 32));
		id = result;
		return result;
	}


	
	
	
	
	
	
}
