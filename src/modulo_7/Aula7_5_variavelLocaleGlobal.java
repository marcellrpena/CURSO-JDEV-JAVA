package modulo_7;

public class Aula7_5_variavelLocaleGlobal {
	
	static int global = 18;
	
	public static void main(String[] args) {
		
		/*Variáveis locais pertencem apenas a esse método como a variável declarada abaixo */
		int local =18;
		
		/*O PRINT SÓ PODE SER ACESSADO SE EU IVOCAR O METODO2, COMO ABAIXO, SEM INVOCAR ELE NÃO
		 * FUNCIONA PORQUE APENAS O MAIN É AUTO EXECUTAVEL*/
	   metodo2();
		
	}
	
	/* a variavel local declarada no metodo main acima não pode ser usada no metodo abaixo*/
	public static void metodo2() {
		
	  System.out.println("a variavel global está disponivel nesse método, seu valor é: "+ global);
		
	}
 
}
