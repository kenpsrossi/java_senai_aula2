package aula_fiama03_02;

import java.util.Scanner;

public class Alturamedia {

	public Alturamedia() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		double alturap1, alturap2, mediaAltura;
		String nomepessoa1, nomepessoa2;
		
		//primeira pessoa
		System.out.println("Dados da primeira pessoa!");
		System.out.println("Nome: ");
		nomepessoa1 = sc.nextLine();
		System.out.println("Altura: ");
		alturap1 = sc.nextDouble();
		
		// segunda pessoa
		System.out.println("Dados da segunda pessoa!");
		System.out.println("Nome: ");
		nomepessoa2 = sc.nextLine();
		//pula a quebra de linha
		sc.next();
		System.out.println("Altura: ");
		alturap2 = sc.nextDouble();
		
		mediaAltura = (alturap1 + alturap2) / 2;
		
		System.out.println("A altura média de:" + nomepessoa1 + nomepessoa2 + mediaAltura);
        System.out.printf("\nA altura média de %s e %s é de %.2f metros.\n", nomepessoa1, nomepessoa2, mediaAltura);

	}

}
