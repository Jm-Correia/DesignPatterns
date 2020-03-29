package br.com.designpattern.composite;

public class TrechoAereo implements Trecho {

	private String origem;
	private String destino;
	private int custo;
	private int duracao;
	
	
	public TrechoAereo(String origem, String destino, int custo, int duracao) {
		super();
		this.origem = origem;
		this.destino = destino;
		this.custo = custo;
		this.duracao = duracao;
	}
	@Override
	public String getOrigem() {
		return origem;
	}
	public void setOrigem(String origem) {
		this.origem = origem;
	}
	@Override
	public String getDestino() {
		return destino;
	}
	public void setDestino(String destino) {
		this.destino = destino;
	}
	@Override
	public int getCusto() {
		return custo;
	}
	public void setCusto(int custo) {
		this.custo = custo;
	}
	@Override
	public int getDuracao() {
		return duracao;
	}
	public void setDuracao(int duracao) {
		this.duracao = duracao;
	}
	
	
	
	
}
