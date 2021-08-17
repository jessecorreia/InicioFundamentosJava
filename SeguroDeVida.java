package modelo;

public class SeguroDeVida implements Tributavel{

	private double valor;
	private String titular;
	private int numeroApolice;
	
	
	public double getValor() {
		return valor;
	}


@Override
	
	public double getValorImposto() {
		return 42 + valor * 0.02;
	}
	
	
	public void setValor(double valor) {
		this.valor = valor;
	}


	public String getTitular() {
		return titular;
	}


	public void setTitular(String titular) {
		this.titular = titular;
	}


	public int getNumeroApolice() {
		return numeroApolice;
	}


	public void setNumeroApolice(int numeroApolice) {
		this.numeroApolice = numeroApolice;
	}

	public String getTipo() {
		return "Seguro de Vida";
	}
	
	
	

}