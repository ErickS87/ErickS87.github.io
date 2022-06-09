
public class Funcionario {
	private String nome;//get e set
	private String departamento;//get e set
	private double salario;//get e set
	private boolean ativo = true;//is
	private Data dataDeNascimento = new Data();//get 
	
	//aumentarSalario
	public void aumentarSalario(double percentual) {
		//this.salario = this.salario + ((this.salario * percentual)/100);
		this.salario += ((this.salario * percentual)/100);
	}
	//demite
	public void demite() {
		this.ativo = false;
	}
	
	public void mostra() {
		System.out.println("Nome: "+this.nome);
		System.out.println("Salário: "+this.salario);
		System.out.println("Departamento: "+this.departamento);
		System.out.println( (this.ativo==true)?"Está empregado":"Não está empregado" );
		System.out.println("Data de nascimento: "+this.dataDeNascimento.getDataCompleta());
		System.out.println();
	}
	//getters and setters
	public Data getDataDeNascimento() {
		return this.dataDeNascimento;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getDepartamento() {
		return departamento;
	}
	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	public boolean isAtivo() {
		return ativo;
	}
}
