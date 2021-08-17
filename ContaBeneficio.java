package modelo;
public class ContaBeneficio extends Conta {

	@Override
	public String getTipo() {
		return "Conta Benefício";
	}
	
	@Override
	public String toString() {
		return "Conta Benefício Número " + getNumero();
	}
	
}


