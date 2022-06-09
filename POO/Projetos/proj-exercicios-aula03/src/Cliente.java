
public class Cliente {
	private String nome;//get e set
	private String cpf;//get e set
	private String email;//get e set
	//Comportamento
	public void mostraInformacoes() {
		System.out.println("Nome: "+this.nome);
		System.out.println("Cpf: "+this.cpf);
		System.out.println("Email: "+this.email);
	}
	//getters and setters
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		if(nome.length()<6)
			return;//Early return
		//Se cair no if essa linha não vai ser executada
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		if(cpf.length()!=11)
			return;//Sai do método
		this.cpf = cpf;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
}
