package aula_fiama03_02;

import java.util.Scanner;

public class Soma {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		double nota1, nota2, soma, media;
		System.out.println("Vamos calcular sua nota!");

		System.out.println("Digite a primeira nota: ");
		nota1 = sc.nextDouble();
		System.out.println("Digite a segunda nota: ");
		nota2 = sc.nextDouble();
		 
		soma = nota1 + nota2;
		media = (nota1 + nota2) / 2;
		System.out.println("A soma das notas é = " + soma);
		System.out.print("Sua Média é = " + media);
		sc.close();

	}

}
