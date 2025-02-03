package aula_fiama03_02;

import java.util.Scanner;

public class Aula2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String texto = sc.next();
		
		int numero;
		numero = sc.nextInt();

		System.out.print(texto +" "+numero);
		sc.close();
	}

}
