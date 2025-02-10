package aula_fiama03_02;

import java.util.Scanner;

public class Quadro {

	public Quadro() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		double largura, altura, areat, perimet, diagonal;
		System.out.println("Vamos ver as medidas do quadro!");
		
		System.out.println("Digite a largura: ");
		largura = sc.nextDouble();
		System.out.println("Digite a altura: ");
		altura = sc.nextDouble();
		
		
		areat = largura * altura;
		perimet = 4 * (largura + altura) ;
		diagonal = (Math.sqrt((largura * largura) + (altura * altura)));		
		
		System.out.println("Área é = " + String.format("%.4f", areat));
		System.out.println("O perímetro = " + String.format("%.4f", perimet ));
		System.out.println("A diagonal é = " + String.format("%.4f", diagonal ));

	}

}
