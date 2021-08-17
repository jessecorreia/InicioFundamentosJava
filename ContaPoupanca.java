package modelo;
public class ContaPoupanca extends Conta {

	public ContaPoupanca() {
		super();

	}

	public ContaPoupanca(double saldo) {
		super.depositar(saldo);

	}

	public String getTipo() {
		return "Conta Poupança";
	}
	
	
	
}
