package lista_arrays;
import java.util.Scanner;
public class A6 {

	public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
        
        double[][] notas = new double[3][4];

        System.out.println("--- Entrada de Notas ---");
        for (int i = 0; i < notas.length; i++) {
            System.out.println("Notas do Aluno " + (i + 1) + ":");
            for (int j = 0; j < notas[i].length; j++) {
                System.out.print("  Avaliação " + (j + 1) + ": ");
                notas[i][j] = scanner.nextDouble();
            }
        }

        System.out.println("\n--- Notas Cadastradas ---");
        for (int i = 0; i < notas.length; i++) {
            System.out.print("Aluno " + (i + 1) + ": ");
            
            for (int j = 0; j < notas[i].length; j++) {
                System.out.print(notas[i][j] + " ");
            }
            
            System.out.println();
        }

        scanner.close();

	}

}
