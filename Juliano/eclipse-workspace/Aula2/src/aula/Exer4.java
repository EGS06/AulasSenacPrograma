package aula;

import java.util.Scanner;

public class Exer4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		double nota1, nota2, media;
		
		System.out.println("informe a nota 1");
		nota1 = teclado.nextDouble();
		System.out.println("informe a nota 2");
		nota2 = teclado.nextDouble();
		media = (nota1 + nota2)/2;
		System.out.println("média final: "+ media);
		if(media >= 6) {
			System.out.println("Aprovado!");
		}
		else {
			System.out.println("Reprovado!");
		}
	}

}
