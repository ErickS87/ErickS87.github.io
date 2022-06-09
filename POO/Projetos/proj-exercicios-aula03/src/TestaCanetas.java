
public class TestaCanetas {
	public static void main(String[] args) {
		Caneta umaCaneta = new Caneta();
		umaCaneta.cor = "Azul";
		umaCaneta.marca = "Pilot";
		umaCaneta.tamanho = 10;
		umaCaneta.tampa = true;
		
		Caneta outraCaneta = new Caneta();
		outraCaneta.cor = "Preta";
		outraCaneta.marca = "Pilot";
		outraCaneta.tamanho = 10;
		
		System.out.println("###INFORMAÇÕES DE umaCaneta");
		System.out.println("Esta é uma caneta de cor "+umaCaneta.cor
				+" e da marca "+umaCaneta.marca);
		
		System.out.println("###INFORMAÇÕES DE outraCaneta");
		System.out.println("Esta já é uma outra caneta de cor "
		+outraCaneta.cor
				+" e da marca "+outraCaneta.marca);
	}
}
