package atividadeif;

import java.util.Scanner;

public class A16 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a média final do aluno: ");
        double media = scanner.nextDouble();

        System.out.println("\n=========================");
        if (media >= 7.0) {
            System.out.println("Aluno aprovado!");
            
            if (media >= 9.5) {
                System.out.println("Aluno aprovado com distinção!");
            }
        } else {
            System.out.println("Aluno reprovado.");
        }
        System.out.println("=========================");
	}

}
