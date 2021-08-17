package modelo;
public class ContaCorrente extends Conta implements Tributavel{

	@Override
	public void sacar(double valor) {
		
		
		
		super.sacar(valor+ 1);
	}

	public ContaCorrente() {
		super();

	}

	public ContaCorrente(double saldo) {
		super.depositar(saldo);

	}

	public String getTipo() {
		return "Conta Corrente";
	}

	@Override
		public double getValorImposto() {
		return getSaldo() * 0.01;
	}
	
	
	
	
	
	
	
}
