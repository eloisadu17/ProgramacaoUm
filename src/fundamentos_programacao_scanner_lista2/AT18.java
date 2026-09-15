package fundamentos_programacao_scanner_lista2;
import java.util.Scanner;
public class AT18 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a média do aluno: ");
        double media = scanner.nextDouble();

        String situacao = (media >= 7.0) ? "Aprovado" : "Reprovado";

        System.out.println("\n=========================");
        System.out.println("Média: " + media);
        System.out.println("Situação: " + situacao);
        System.out.println("=========================");

	}

}
