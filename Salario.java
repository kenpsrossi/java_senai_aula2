package aula_fiama03_02;

import java.util.Scanner;

public class Salario {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double salario, diastrabalho, valordiatrabalho;
		System.out.println("Vamos calcular seu salário!");

		System.out.println("Digite os dias trabalhados: ");
		diastrabalho = sc.nextDouble();
		
		System.out.println("Digite o valor dia trabalho: ");
		valordiatrabalho = sc.nextDouble();
		
		 
		salario = diastrabalho * valordiatrabalho;
		
		System.out.println("Dias trabalhados = " + diastrabalho);
		System.out.print("Seu Salário é = " + salario );
		sc.close();
	}

}
