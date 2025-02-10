package aula_fiama03_02;

import java.util.Scanner;

public class Piso {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		double largura, comprim, valorm2, area, custo;
		System.out.println("Vamos calcular o orçamento para o piso!");
		
		System.out.println("Digite a largura: ");
		largura = sc.nextDouble();
		System.out.println("Digite o comprimento: ");
		comprim = sc.nextDouble();
		System.out.println("Digite o valor do metro quadrado: ");
		valorm2 = sc.nextDouble();
		System.out.println("Digite o valor do metro quadrado: " + String.format("%.2f", valorm2));
	
		
		area = largura * comprim;		
		custo = area * valorm2;
		
		System.out.println("Área do cômodo é = " + String.format("%.2f", area));
		System.out.print("O custo total piso= " + String.format("%.2f", custo));
		

	}

}
