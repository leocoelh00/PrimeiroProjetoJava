public class Pessoa {
	private Cliente titular;
	private double saldo;
	private int agencia;
	private int numero;
	private Chaves pix;
	
	public Pessoa(int agencia, int numero){
		this.agencia = agencia;
		this.numero = numero;
		System.out.println("Sua Conta é: " + agencia + "\nSua Agencia é: " + numero);
	}

	public void deposita(double valor) {
		this.saldo += valor;
	}
	public void setNumero() {
		if(numero <= 0 ) {
			System.out.println("Nao é possivel valores menor ou igual a 0");
		return;
		}
		}
	public void setAgencia() {
		if(agencia <= 0) {
			System.out.println("Nao é possivel valor menor igual a zero");
		return;
		}
	}
	

	public boolean saca(double valor) {
		if (this.saldo >= valor) {
			this.saldo -= valor;
			return true;
		} else {
			return false;
		}
	
	}
	public boolean Transfere(double valor, Pessoa destino) {
		if ( this.saldo >= valor) {
			this.saldo -= valor;
			destino.deposita(valor);
			return true;
		}
			return false;
		}
	

	public double getSaldo() {
		return this.saldo;
	}

	public Chaves getPix() {
		return pix;

	}

	public void setPix(Chaves pix) {
		this.pix = pix;
	}

	public Cliente getTitular() {
		return titular;
	}

	public void setTitular(Cliente titular) {
		this.titular = titular;
	}

}
