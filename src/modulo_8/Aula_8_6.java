package modulo_8;

import java.util.Scanner;

  public class Aula_8_6 {
		public static void main(String[] args) {
			/*Para o objeto String Saida se tornar acessivel dentro de todo o código é necessário
			 * declarar ele diretamente no método, e nunca dentro de uma função */
			String sair;
			String Resultado;
			int fora = 0;
			/*Objeto teclado da classe scanner recebe um novo dado extraído da entrada do 
			sistema pela classe scanner*/
			Scanner teclado = new Scanner(System.in);
			/*O codigo começa com o comando "do", ou seja, primeiro é executado o codigo 
			 * e só depois é executada a condição "while", então enquanto aquela condição for satisfeita
			 * o codigo continuará rodando, uma outra forma de executar a condição enquanto é definindo
			 * primeiro a condição while e só então exexutando o "do" ex:
			 * while (condição){codigo a ser executado}*/
			do {
			
		
			/*Interação visual com o usuário*/
			System.out.println("Digite a primeira nota do Aluno");
			/*Objeto da classe inteiro recebe o conteúdo convertido de String para Inteiro do Objeto Teclado 
			 * da classe Scanner que foi captado da linha digitada pelo usuário  */
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
				System.out.println("você está abaixo da média precisa estudar mais");
			 break;
			case "b":
				System.out.println("Você está na média e passou, mas pode melhorar");
				break;
			case "a" :
				System.out.println("Parabéns, você passou com louvor, continue assim");
				break;
			}
			/*Segundo loop while, aqui usado para captar a resposta correta do usuário sendo ela 
			 * para continuar ou para parar de executar o programa */
			do {
			
				
		       		if( fora == 2 ) {
					System.out.println("!!!!! ATENÇÃO VOCÊ NÃO DIGITOU A TECLA CORRETA!!!! \n");
				    }
			        System.out.println("deseja continuar com a classificação dos Alunos?");
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
			System.out.println("até a próxima");
	}

}
