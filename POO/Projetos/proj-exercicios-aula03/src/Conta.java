public class Conta {
	//Atributos
	private Cliente titular = new Cliente();//obter Não tem atribuir (imutável)
	private int numero; //atribuir e obter
	private double saldo = 500; //obter
	//getters and setters
	public int getNumero() {
		return this.numero;
	}
	public void setNumero(int numero) {
		if(numero>0)
			this.numero = numero;
			//atributo = argumento
	}
	public Cliente getTitular() {
		return this.titular;
	}
	public double getSaldo() {
		return this.saldo;
	}
	//Comportamento / métodos
	public boolean saca(double valor) {
		if(valor>this.saldo) {
			return false;
		}else {
			this.saldo = this.saldo - valor;
			return true;
		}	
	}
	
	public boolean deposita(double valor) {
		if(valor<=0) {
			return false;
		}else {
			//this.saldo = this.saldo + valor;
			this.saldo+=valor;
			return true;
		}
	}
	//conta1.transfere(200,conta2);
	//conta1 é o this e conta2 é a contaDestino
	//conta1.transferePara(conta2, 200);
	public boolean transferePara(Conta contaDestino, double valor) {
		if(this.saca(valor)==true) {
			return contaDestino.deposita(valor);//vai retornar true
			//return true;
		}
		//else
			return false;
	}
	
	public void mostraInformacoes() {
		System.out.println("Número "+this.numero);
		System.out.println("Saldo "+this.saldo);
		System.out.println("Titular "+this.titular);
		this.titular.mostraInformacoes();
	}
}
