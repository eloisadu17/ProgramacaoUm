package fundamentos_programacao_scanner_lista2;

import java.util.Scanner;

public class AT1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nome: ");
        String nome = scanner.nextLine();

        System.out.print("Digite a idade: ");
        int idade = scanner.nextInt();
        scanner.nextLine(); 

        System.out.print("Digite o curso: ");
        String curso = scanner.nextLine();

        System.out.print("Digite a altura: ");
        double altura = scanner.nextDouble();

        System.out.print("Digite a média final: ");
        double mediaFinal = scanner.nextDouble();

        System.out.print("Está matriculado? (true/false): ");
        boolean estaMatriculado = scanner.nextBoolean();

        System.out.println("\n=========================");
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade + " anos");
        System.out.println("Curso: " + curso);
        System.out.println("Altura: " + altura + " m");
        System.out.println("Média final: " + mediaFinal);
        System.out.println("Está matriculado: " + estaMatriculado);
        System.out.println("=========================");
	}

}
