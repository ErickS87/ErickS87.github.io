
public class Cliente {
	private String nome;
	private String cpf;
	String email;
	// atalho: crt + 3 + ggas (generate getters and setters)

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		if(nome.length()<6)
			return;
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		if(cpf.length()!=11)
			return;
		this.cpf = cpf;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void mostraInformacoes() {
		System.out.println("Nome: " + this.nome);
		System.out.println("Cpf: " + this.cpf);
		System.out.println("email: " + this.email);
	}

}
