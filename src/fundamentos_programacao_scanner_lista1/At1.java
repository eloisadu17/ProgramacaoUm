package fundamentos_programacao_scanner_lista1;
import java.util.Scanner;
public class At1 {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nome do aluno: ");
        String nome = scanner.nextLine();

        System.out.print("Digite a idade do aluno: ");
        int idade = scanner.nextInt();

        System.out.print("Digite a altura do aluno (em metros): ");
        double altura = scanner.nextDouble();

        System.out.print("Digite o peso do aluno (em kg): ");
        double peso = scanner.nextDouble();

        System.out.print("Digite o sexo do aluno (M/F): ");
        char sexo = scanner.next().charAt(0);

        System.out.print("A matrícula está ativa? (true/false): ");
        boolean matriculaAtiva = scanner.nextBoolean();

        System.out.println("\n=========================");
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade + " anos");
        System.out.println("Altura: " + altura + " m");
        System.out.println("Peso: " + peso + " kg");
        System.out.println("Sexo: " + sexo);
        System.out.println("Situação da matrícula: " + (matriculaAtiva ? "Ativa" : "Inativa"));
        System.out.println("=========================");

	}

}
