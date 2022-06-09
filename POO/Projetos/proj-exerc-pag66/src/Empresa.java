import java.util.Arrays;

public class Empresa {
	//atributos
	private String nome,cnpj; // get e set 
	private Funcionario[] empregados = new Funcionario[1]; //get
	private int posicaoLivre; // 0
	//adiciona
	public void adiciona(Funcionario f) {
		//Situação em que eu estouro os limites do array
		if(this.posicaoLivre == this.empregados.length) {
			this.aumentarArray();
		}	
		this.empregados[this.posicaoLivre] = f;
		this.posicaoLivre++;
	}
	//aumentarArray (método encapsulado)
	private void aumentarArray() {
		Funcionario[] novoArray = new Funcionario[this.empregados.length+1];
		for (int i = 0; i < this.empregados.length; i++) {
			novoArray[i] = this.empregados[i];
		}
		this.empregados = novoArray;
	}
	//mostraEmpregados
	public void mostraEmpregados() {
		for (Funcionario func : empregados) {
			if(func != null)
				func.mostra();
		}
	}
	//fazParteDaEmpresa
	public boolean fazParteDaEmpresa(Funcionario f) {
		Funcionario oProcurado = f;
		for (int i = 0; i < empregados.length; i++) { 
			if(this.empregados[i]==oProcurado) 
				return true;
		}
		return false;
	}
	//remove
	public void remove(Funcionario f) {
		for (int i = 0; i < empregados.length; i++) {
			if(f == this.empregados[i]) {
				//remove
				this.empregados[i] = null;
				this.reorganizaArray();
				//this.posicaoLivre --;
			}
		}
	}
	
	private void reorganizaArray() {
		/*Funcionario[] novoArray = new Funcionario[this.empregados.length];
		for (int i =0, j = 0; i < empregados.length; i++) {
			if(this.empregados[i]!=null) {
				novoArray[j]=this.empregados[i];
				j++;
				//this.posicaoLivre --;
			}
		}*/
		this.empregados = Arrays.copyOf(this.empregados, this.empregados.length+1);
		this.posicaoLivre --;
	}
	//get e set
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCnpj() {
		return cnpj;
	}
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	public Funcionario[] getEmpregados() {
		return empregados;
	}
	
	
}
