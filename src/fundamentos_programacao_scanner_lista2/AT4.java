package fundamentos_programacao_scanner_lista2;
import java.util.Scanner;
public class AT4 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a primeira nota: ");
        double nota1 = scanner.nextDouble();

        System.out.print("Digite a segunda nota: ");
        double nota2 = scanner.nextDouble();

        System.out.print("Digite a terceira nota: ");
        double nota3 = scanner.nextDouble();

        double soma = nota1 + nota2 + nota3;
        double media = soma / 3;

        System.out.println("\n=========================");
        System.out.println("Soma das notas: " + String.format("%.2f", soma));
        System.out.println("Média final: " + String.format("%.2f", media));
        System.out.println("=========================");
	}

}
