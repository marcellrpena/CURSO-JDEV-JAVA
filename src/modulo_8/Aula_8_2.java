package modulo_8;

public class Aula_8_2 {

	public static void main(String[] args) {
		/*Operadores tern�rios s�o condi�oes 
		 * semelhantes ao if e else, por�m s�o 
		 * para microopera��es de no m�ximo 
		 * 1 linha ex:*/
		int Nota1 = 70;
		int Nota2 = 50;
		int Nota3 = 35;
		int Media = (Nota1+ Nota2 + Nota3)/3;
		
		String Resultado;
		/*L�-se o c�digo abaixo da seguinte forma:
		 * Se verdadeiro o conte�do do Objeto MEDIA for
		 * maior ou igual a 70 , o Objeto RESULTADO
		 * recebe "Aluno Aprovado" se falso recebe
		 * Aluno reprovado.*/
		Resultado = Media >= 70 ? "Aluno Aprovado" : "Aluno Reprovado" ;
		System.out.println(Resultado);
	}
}
