
public class TestaCondicional {

	public static void main(String[] args) {
		System.out.println("testando condicionais");
		int idade = 16;
		int quantidadePessoas = 3;
		
		if (idade >= 18) {
			System.out.println("voc� tem mais de 18 anos ");
			System.out.println("seja Bem-Vinde ");
		} else {
			if(quantidadePessoas >= 2) {
				System.out.println("voc� N�o tem 18, mas pode entrar por estar acompanhado");
			} else {
				System.out.println("infelizmente Voc� n�o pode entrar");

		}
	}
	}
}
