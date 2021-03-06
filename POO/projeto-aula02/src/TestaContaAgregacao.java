
public class TestaContaAgregacao {

	public static void main(String[] args) {

		Conta conta1 = new Conta();
		conta1.getTitular().setNome("Gabriel");
		conta1.getTitular().setCpf("12345678911");
		conta1.setNumero(1);
		if (conta1.deposita(-100) == false)
			System.out.println("Saldo inv?lido para deo?sito para a conta de numero "+conta1.getNumero());
		if (conta1.saca(100) == false)
			System.out.println("Saldo insuficiente. A conta s? possui " + conta1.getSaldo());

		Conta conta2 = new Conta();
		conta2.getTitular().setNome("Rodrigo");
		conta2.getTitular().setCpf("12345678922");
		conta2.setNumero(25);
		if (!conta2.deposita(500))
			System.out.println("Valor inv?lido para dep?sito");
		if (conta2.saca(1001) == false)
			System.out.println("Saldo insuficiente. A conta s? possui " + conta2.getSaldo());

		System.out.println("");
		conta2.mostraInformacies();
		
		System.out.println("Vou transferir 200 reais do Rodrigo para o Gabriel ");
		conta2.transferePara(conta1, 200);
		
		System.out.println("Depois da transferencia;;;");
		conta1.mostraInformacies();
		System.out.println("");
		conta2.mostraInformacies();

	}

}
