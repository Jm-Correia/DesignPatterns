package br.com.designpattern.composite;

public class TrechoAereoConexao extends TrechoAereoEscala {

	private int custo;
	
	public TrechoAereoConexao(TrechoAereo t1, TrechoAereo t2, int custo) {
		super(t1, t2);
		this.custo = custo;
	}
	
	@Override
	public int getCusto() {
		return super.getCusto() + custo;
	}

}
