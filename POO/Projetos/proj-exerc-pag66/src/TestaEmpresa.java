
public class TestaEmpresa {

	public static void main(String[] args) {
		Empresa emp = new Empresa();
		emp.setNome("CEFET");
		
		Funcionario func1 = new Funcionario();
		func1.setNome("Lucas");
		func1.setSalario(3000);
		func1.setDepartamento("Vendas");
		func1.getDataDeNascimento().setDia("04");
		func1.getDataDeNascimento().setMes("08");
		func1.getDataDeNascimento().setAno("2001");
		
		Funcionario func2 = new Funcionario();
		func2.setNome("Isadora");
		func2.setSalario(4000);
		func2.setDepartamento("Contabilidade");
		func2.getDataDeNascimento().setDia("04");
		func2.getDataDeNascimento().setMes("10");
		func2.getDataDeNascimento().setAno("2001");
		
		Funcionario func3 = new Funcionario();
		func3.setNome("Rodrigo");
		
		emp.adiciona(func1);
		emp.adiciona(func2);
		emp.adiciona(func3);
		
		emp.mostraEmpregados();
		emp.remove(func2);
		System.out.println("#########Depois de remover func2###########");
		emp.mostraEmpregados();
		
		/*
		 * if(emp.fazParteDaEmpresa(func1)==true) {
		 * System.out.println("O funcionario "+func1.getNome()+" está na empresa!");
		 * }else {
		 * System.out.println("O funcionario "+func1.getNome()+" NÃO está na empresa!");
		 * }
		 */
	}

}
