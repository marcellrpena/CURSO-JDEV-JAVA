package modulo_7;

public class Aula7_5_variavelLocaleGlobal {
	
	static int global = 18;
	
	public static void main(String[] args) {
		
		/*Vari�veis locais pertencem apenas a esse m�todo como a vari�vel declarada abaixo */
		int local =18;
		
		/*O PRINT S� PODE SER ACESSADO SE EU IVOCAR O METODO2, COMO ABAIXO, SEM INVOCAR ELE N�O
		 * FUNCIONA PORQUE APENAS O MAIN � AUTO EXECUTAVEL*/
	   metodo2();
		
	}
	
	/* a variavel local declarada no metodo main acima n�o pode ser usada no metodo abaixo*/
	public static void metodo2() {
		
	  System.out.println("a variavel global est� disponivel nesse m�todo, seu valor �: "+ global);
		
	}
 
}
