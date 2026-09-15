package fundamentos_programacao_scanner_lista1;
import java.util.Scanner;
public class AT10 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nome do aluno: ");
        String aluno = scanner.nextLine();

        System.out.print("Digite o nome do curso: ");
        String curso = scanner.nextLine();

        System.out.print("Digite a idade do aluno: ");
        int idade = scanner.nextInt();

        System.out.println("==============================");
        System.out.println("Aluno: " + aluno);
        System.out.println("Curso: " + curso);
        System.out.println("Idade: " + idade + " anos");
        System.out.println("==============================");
	}

}
