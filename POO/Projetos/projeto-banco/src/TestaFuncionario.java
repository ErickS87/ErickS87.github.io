public class TestaFuncionario {
	public static void main(String[] args) {
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
		
		func1.mostra();
		System.out.println();
		func2.mostra();
		
		System.out.println();
		System.out.println("Vou aumentar o salário do lucas em 20% e vou demitir a Isadora");
		func1.aumentarSalario(20);
		func2.demite();
		
		func1.mostra();
		System.out.println();
		func2.mostra();
		
	}
}
