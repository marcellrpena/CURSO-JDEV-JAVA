package modulo_8;
import java.util.Scanner;

public class Aula_8_4 {
	//M�todo auto execut�vel no java
	public static void main(String[] args) {
		/*Objeto teclado da classe scanner recebe um novo dado extra�do da entrada do 
		sistema pela classe scanner*/
		Scanner teclado = new Scanner(System.in);
		/*Intera��o visual com o usu�rio*/
		String Resultado;
		System.out.println("Digite a primeira nota do Aluno");
		/*Objeto da classe inteiro recebe o conte�do convertido de String para Inteiro do Objeto Teclado 
		 * da classe Scanner que foi captado da linha digitada pelo usu�rio  */
		int nota1 = Integer.parseInt(teclado.nextLine());
		System.out.println("Digite a segunda nota do Aluno");
		int nota2 = Integer.parseInt(teclado.nextLine());
		System.out.println("Digite a terceira nota do Aluno");
		int nota3 = Integer.parseInt(teclado.nextLine());
		System.out.println("Digite a quarta nota do Aluno");
		int nota4 = Integer.parseInt(teclado.nextLine());
		int media = (nota1+nota2+nota3+nota4)/4;
		if(media < 60) {
			Resultado = "c";
		}else if(media >= 60 & media<70) {
			Resultado = "b";
		}else {
			Resultado = "a";
		}
		switch(Resultado) {
		case "c":
			System.out.println("voc� est� abaixo da m�dia precisa estudar mais");
		 break;
		case "b":
			System.out.println("Voc� est� na m�dia e passou, mas pode melhorar");
			break;
		case "a" :
			System.out.println("Parab�ns, voc� passou com louvor, continue assim");
			break;
		}
		
		
   }
}