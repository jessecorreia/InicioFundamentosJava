package modelo;
public class ContaBeneficio extends Conta {

	@Override
	public String getTipo() {
		return "Conta Benef?cio";
	}
	
	@Override
	public String toString() {
		return "Conta Benef?cio N?mero " + getNumero();
	}
	
}


