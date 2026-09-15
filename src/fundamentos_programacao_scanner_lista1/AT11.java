package fundamentos_programacao_scanner_lista1;
import java.util.Scanner;
public class AT11 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nome do aluno: ");
        String nomeAluno = scanner.nextLine();

        System.out.print("Digite a nota do aluno: ");
        int nota = scanner.nextInt();

        System.out.print("Digite a frequência do aluno (%): ");
        int frequencia = scanner.nextInt();

        String situacao = (nota >= 6 && frequencia >= 75) ? "Aprovado" : "Reprovado";

        System.out.println("\nAluno: " + nomeAluno);
        System.out.println("Situação: " + situacao);
	}

}
