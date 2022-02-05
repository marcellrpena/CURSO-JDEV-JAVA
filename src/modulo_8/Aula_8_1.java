package modulo_8;
/*Importando uma classe de nome Scanner do Pacote UTIL*/
import java.util.Scanner;

public class Aula_8_1 {
	/*Criando um metodo auto execut�vel*/
	public static void main(String[] args) {
		/*Cria��o de um objeto chamado teclado que recebe um dado extra�do do sistema pela classe Scanner*/
		Scanner teclado = new Scanner(System.in);
		/*No caso de Strings para que elas possam ser usadas em todo o c�digo do m�todo � preciso
		 * declara-la como uma vari�vel separadamente*/
		String Resultado;
		
		System.out.println("Digite a primeira nota do aluno");
		/*para interagir com o usuario � criado um objeto do tipo double de nome Nota1  que recebe 
		 * um dado do objeto teclado da classe Scanner que capturou a linha anterior escrita pelo 
		 * teclado, esse dado est� em formato de String e � convertido para o formato double*/
		double Nota1 = Double.parseDouble(teclado.nextLine());
		System.out.println("Digite a segunda nota do aluno");
		double Nota2 = Double.parseDouble(teclado.nextLine());
		System.out.println("Digite a terceira nota do aluno");
		double Nota3 = Double.parseDouble(teclado.nextLine());
		/*� criada um Objeto de nome Media do tipo float necessario para o codigo a seguir, esse objeto
		 * n�o pode receber um dado de outro tipo, portanto para converter o dado do tipo Double das notas
		 * primeiro eu converti o dado do tipo DOUBLE em STRING e logo ap�s converti do tipo STRING
		 * para o tipo FLOAT */
		float Media = Float.parseFloat(Double.toString((Nota1 + Nota2 + Nota3)/3));
		/*De acordo com os dados dos alunos o sistema retorna a mensagem espec�fica para cada condi��o
		 *  exigida pelo sistema com o resultado alcan�ado da m�dia*/
		if (Media >= 70) {
			Resultado =" Parab�ns, voc� foi aprovado e est� acima da m�dia";
		}
		else if(Media>=60 && Media < 70 ){
			Resultado = " Parab�ns, voc� foi aprovado mas pode melhorar sua nota est� na m�dia ou "
					+ "muito pr�xima da m�dia";
		}else {
			Resultado =" Voc� n�o foi aprovado, procure estudar um pouco mais";
		}
		/*No java � poss�vel diminuir o n�mero de casas decimais antes do zero, por�m com o tipo double 
		 * n�o � possivel usar essa ferramenta por isso foi feita a convers�o para o tipo FLOAT e ent�o
		 * � usado  o c�digo: %.nf , sendo N o n�mero de casas que voc� deseja que sejam mostradas no
		 * resultado*/
		/*para formatar os resultados usa-se o format em vez do println, no format a concatena��o n�o
		 *pode ser com o "+" � usado a "," */
		 /*Se quiser saltar uma linha para imprimir o proximo print uso o codigo com o \n como abaixo:*/
		System.out.format("sua m�dia foi de : %.4f \n",Media);
		//System.out.format("sua m�dia foi de : %.4f ",Media);
		System.out.println(Resultado);
	}

}
