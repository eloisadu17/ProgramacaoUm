package atividadeif;

import java.util.Scanner;

public class A18 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a média do aluno: ");
        double media = scanner.nextDouble();

        System.out.print("Digite o percentual de frequência (%): ");
        double frequencia = scanner.nextDouble();

        System.out.println("\n=========================");
        if (media >= 7.0 && frequencia >= 75.0) {
            System.out.println("Aluno aprovado!");
            if (media >= 9.5) {
                System.out.println("Aluno aprovado com mérito.");
            }
        } else {
            System.out.println("Aluno reprovado.");
        }
        System.out.println("=========================");
	}

}
