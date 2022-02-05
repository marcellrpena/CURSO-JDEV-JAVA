package modulo_8;

public class Aula_8_2 {

	public static void main(String[] args) {
		/*Operadores ternários são condiçoes 
		 * semelhantes ao if e else, porém são 
		 * para microoperaçôes de no máximo 
		 * 1 linha ex:*/
		int Nota1 = 70;
		int Nota2 = 50;
		int Nota3 = 35;
		int Media = (Nota1+ Nota2 + Nota3)/3;
		
		String Resultado;
		/*Lê-se o código abaixo da seguinte forma:
		 * Se verdadeiro o conteúdo do Objeto MEDIA for
		 * maior ou igual a 70 , o Objeto RESULTADO
		 * recebe "Aluno Aprovado" se falso recebe
		 * Aluno reprovado.*/
		Resultado = Media >= 70 ? "Aluno Aprovado" : "Aluno Reprovado" ;
		System.out.println(Resultado);
	}
}
