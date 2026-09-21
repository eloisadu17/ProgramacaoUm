package lista_arrays;
import java.util.Scanner;
public class Exercicio1 {

	public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
        
        double[] notas = new double[5];
        double soma = 0.0;

        System.out.println("--- Entrada de Notas ---");
        for (int i = 0; i < notas.length; i++) {
            System.out.print("Informe a nota do aluno " + (i + 1) + ": ");
            notas[i] = scanner.nextDouble();
        }

        System.out.println("\n--- Notas Informadas ---");
        for (int i = 0; i < notas.length; i++) {
            System.out.println("Aluno " + (i + 1) + ": " + notas[i]);
            soma += notas[i];
        }

        double media = soma / notas.length;
        System.out.printf("\nMédia da turma: %.2f\n", media);

        scanner.close();
		
		
	}
}
