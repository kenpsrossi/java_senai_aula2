package aula_fiama03_02;


import java.util.Scanner;

public class Calculosalario {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Valores  para cada função
        double salarioJunior = 100.0;
        double salarioPleno = 200.0;
        double salarioSenior = 300.0;

       
        System.out.print("Digite o número de dias trabalhados: ");
        int diasTrabalhados = scanner.nextInt();

   
        System.out.print("Digite a função (junior, pleno, senior): ");
        String funcao = scanner.next();

        // Calcula o salário com base na função e nos dias trabalhados
        double salario = 0.0;
        switch (funcao.toLowerCase()) {
            case "junior":
                salario = diasTrabalhados * salarioJunior;
                break;
            case "pleno":
                salario = diasTrabalhados * salarioPleno;
                break;
            case "senior":
                salario = diasTrabalhados * salarioSenior;
                break;
            default:
                System.out.println("Função inválida.");
                System.exit(1);
        }

       
        System.out.println("O salário é: R$ " + salario);
    }
}