package br.com.designpattern.enumeration;

public enum TipoCarro {

	SUV(1, 8),
	COMPACT(2, 4),
	MEDIO(3, 6),
	CAMINHAO(4, 15);
	
	
	private int cod;
	private int value;
	
	
	private TipoCarro(int cod, int value) {
		this.cod = cod;
		this.value = value;
	}


	public int getCod() {
		return cod;
	}


	public int getValue() {
		return value;
	}
	
	public TipoCarro getTipoById(int cod) throws Exception {
		for(TipoCarro tipo: TipoCarro.values()) {
			if(tipo.getCod() == cod) 
				return tipo;
		}
		throw new Exception("Código [ " + cod   + " ] não encontrado.");
	}
	
}
