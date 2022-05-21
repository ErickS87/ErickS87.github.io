
public class Conta {

	private Cliente titular = new Cliente();
	private int numero;
	private double saldo = 500;

	public int getNumero() {
		return this.numero;
	}

	public void setNumero(int numero) {
		if (numero > 0)
			this.numero = numero;
	}

	public Cliente getTitular() {
		return this.titular;
	}

	public double getSaldo() {
		return this.saldo;
	}

	public boolean saca(double valor) {
		if (valor > this.saldo) {
			return false;
		} else {
			this.saldo = this.saldo - valor;
			return true;
		}
	}

	public boolean deposita(double valor) {
		if (valor <= 0) {
			return false;
		} else {
			this.saldo += valor;
			return true;
		}
	}

	public boolean transferePara(Conta contaDestino, double valor) {
		if (this.saca(valor) == true) {
			return contaDestino.deposita(valor);
		}
		return false;
	}

	public void mostraInformacies() {
		System.out.println("Numero " + this.numero);
		System.out.println("Saldo " + this.saldo);
		System.out.println("Titular");
		System.out.println("Titular " + this.titular);
		this.titular.mostraInformacoes();
	}

}
