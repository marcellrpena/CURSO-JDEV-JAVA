package modulo_8;
/*Importando uma classe de nome Scanner do Pacote UTIL*/
import java.util.Scanner;

public class Aula_8_1 {
	/*Criando um metodo auto executável*/
	public static void main(String[] args) {
		/*Criação de um objeto chamado teclado que recebe um dado extraído do sistema pela classe Scanner*/
		Scanner teclado = new Scanner(System.in);
		/*No caso de Strings para que elas possam ser usadas em todo o código do método é preciso
		 * declara-la como uma variável separadamente*/
		String Resultado;
		
		System.out.println("Digite a primeira nota do aluno");
		/*para interagir com o usuario é criado um objeto do tipo double de nome Nota1  que recebe 
		 * um dado do objeto teclado da classe Scanner que capturou a linha anterior escrita pelo 
		 * teclado, esse dado está em formato de String e é convertido para o formato double*/
		double Nota1 = Double.parseDouble(teclado.nextLine());
		System.out.println("Digite a segunda nota do aluno");
		double Nota2 = Double.parseDouble(teclado.nextLine());
		System.out.println("Digite a terceira nota do aluno");
		double Nota3 = Double.parseDouble(teclado.nextLine());
		/*é criada um Objeto de nome Media do tipo float necessario para o codigo a seguir, esse objeto
		 * não pode receber um dado de outro tipo, portanto para converter o dado do tipo Double das notas
		 * primeiro eu converti o dado do tipo DOUBLE em STRING e logo após converti do tipo STRING
		 * para o tipo FLOAT */
		float Media = Float.parseFloat(Double.toString((Nota1 + Nota2 + Nota3)/3));
		/*De acordo com os dados dos alunos o sistema retorna a mensagem específica para cada condição
		 *  exigida pelo sistema com o resultado alcançado da média*/
		if (Media >= 70) {
			Resultado =" Parabéns, você foi aprovado e está acima da média";
		}
		else if(Media>=60 && Media < 70 ){
			Resultado = " Parabéns, você foi aprovado mas pode melhorar sua nota está na média ou "
					+ "muito próxima da média";
		}else {
			Resultado =" Você não foi aprovado, procure estudar um pouco mais";
		}
		/*No java é possível diminuir o número de casas decimais antes do zero, porém com o tipo double 
		 * não é possivel usar essa ferramenta por isso foi feita a conversão para o tipo FLOAT e então
		 * é usado  o código: %.nf , sendo N o número de casas que você deseja que sejam mostradas no
		 * resultado*/
		/*para formatar os resultados usa-se o format em vez do println, no format a concatenação não
		 *pode ser com o "+" é usado a "," */
		 /*Se quiser saltar uma linha para imprimir o proximo print uso o codigo com o \n como abaixo:*/
		System.out.format("sua média foi de : %.4f \n",Media);
		//System.out.format("sua média foi de : %.4f ",Media);
		System.out.println(Resultado);
	}

}
