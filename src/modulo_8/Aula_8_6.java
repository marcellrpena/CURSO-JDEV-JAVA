package modulo_8;

import java.util.Scanner;

  public class Aula_8_6 {
		public static void main(String[] args) {
			/*Para o objeto String Saida se tornar acessivel dentro de todo o c�digo � necess�rio
			 * declarar ele diretamente no m�todo, e nunca dentro de uma fun��o */
			String sair;
			String Resultado;
			int fora = 0;
			/*Objeto teclado da classe scanner recebe um novo dado extra�do da entrada do 
			sistema pela classe scanner*/
			Scanner teclado = new Scanner(System.in);
			/*O codigo come�a com o comando "do", ou seja, primeiro � executado o codigo 
			 * e s� depois � executada a condi��o "while", ent�o enquanto aquela condi��o for satisfeita
			 * o codigo continuar� rodando, uma outra forma de executar a condi��o enquanto � definindo
			 * primeiro a condi��o while e s� ent�o exexutando o "do" ex:
			 * while (condi��o){codigo a ser executado}*/
			do {
			
		
			/*Intera��o visual com o usu�rio*/
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
			/*Segundo loop while, aqui usado para captar a resposta correta do usu�rio sendo ela 
			 * para continuar ou para parar de executar o programa */
			do {
			
				
		       		if( fora == 2 ) {
					System.out.println("!!!!! ATEN��O VOC� N�O DIGITOU A TECLA CORRETA!!!! \n");
				    }
			        System.out.println("deseja continuar com a classifica��o dos Alunos?");
			        System.out.println("Caso queira continuar digite 1 , caso queira parar digite 2");
			        sair = teclado.nextLine();
			        System.out.println(sair);	
			       switch (sair){
			       case "1":
			    	   fora = 1;
			    	   break;
			       case "2":
			    	   fora = 1;
			    	   break;
			    	default: fora = 2;   
			       }
			    }while ( fora == 2 );
			
			fora = Integer.parseInt(sair);
			  
	   }while ( fora == 1);
			System.out.println("at� a pr�xima");
	}

}
