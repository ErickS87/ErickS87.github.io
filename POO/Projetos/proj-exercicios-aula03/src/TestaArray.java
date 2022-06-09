
public class TestaArray {
	public static void main(String[] args) {
		int[] idades = new int[5];
		
		idades[3] = 28;
		idades[2] = 25;
		
		for(int i=0;i<idades.length;i++)
			System.out.println("Posição "+i+" = "+idades[i]);
		
		for (int idade : idades) {
			System.out.println(idade);
		}
		
		Conta conta2 = new Conta();//xyz
		conta2.getTitular().setNome("Rodrigo");
		conta2.getTitular().setCpf("12345678922");
		conta2.setNumero(25);
		
		Conta[] contas = new Conta[5];
		contas[3] = new Conta();//xpto
		contas[3].getTitular().setNome("Gabriel");
		contas[3].getTitular().setCpf("12345678911");
		contas[3].setNumero(1);
		
		contas[2] = conta2;
		contas[2].getTitular().setNome("Rodrigo Zacharias");
		
		for (int i = 0; i < contas.length; i++) {
			if(contas[i]!=null)
				contas[i].mostraInformacoes();
		}
		
		for (Conta conta : contas) {
			if(conta!=null)
				conta.mostraInformacoes();
		}
		
		
	}
}
