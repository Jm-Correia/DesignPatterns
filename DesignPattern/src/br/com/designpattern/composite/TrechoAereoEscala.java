package br.com.designpattern.composite;

public class TrechoAereoEscala implements Trecho {

	
	private Trecho t1, t2;
	
	public TrechoAereoEscala(TrechoAereo t1, TrechoAereo t2) {
		if(!t1.getDestino().equals(t2.getOrigem()))
				throw new RuntimeException("Nao é possivel realizar escala entres os aeroportos");
		this.t1 = t1;
		this.t2 = t2;
	}

	@Override
	public String getOrigem() {
		// TODO Auto-generated method stub
		return t1.getOrigem();
	}

	@Override
	public String getDestino() {
		// TODO Auto-generated method stub
		return t2.getDestino();
	}

	@Override
	public int getCusto() {
		// TODO Auto-generated method stub
		return t1.getCusto() + t2.getCusto();
	}

	@Override
	public int getDuracao() {
		// TODO Auto-generated method stub
		return t1.getDuracao() + t2.getDuracao();
	}

}
