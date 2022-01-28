package modulo_7;

public class Aula7_10_Concatenacao_de_var {

	public static void main(String[] args) {
		String nome = "KKKKKKKK";
		String cpf = "123.123.123-34";
		String telefone = "38-932838383";
		String endereco = "Rua rua rua ";
		 
		/* Dentro das aspas do print ou String pode ser usado o termo "\n" esse termo 
		 * pula para a proxima linha se usar em sequencia, por exemplo: \n\n , ele pula duas linhas
		 * e assim por diante*/
		System.out.println("meu nome é " + nome + "\n\nmeu CPF é: " + cpf + "\nMeu telefone é: " 
		 + telefone + "\nMeu endereço é: "+ endereco);

	}

}
