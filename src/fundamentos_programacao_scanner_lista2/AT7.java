package fundamentos_programacao_scanner_lista2;
import java.util.Scanner;
public class AT7 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor da nota (ex: 8,95): ");
        double notaInicial = scanner.nextDouble();

        int notaInteira = (int) notaInicial;

        double notaDoubleConvertida = notaInteira;

        System.out.println("\n=========================");
        System.out.println("Valor inicial (double): " + notaInicial);
        System.out.println("Convertido para int: " + notaInteira);
        System.out.println("Convertido para double novamente: " + notaDoubleConvertida);
        System.out.println("=========================");
	}

}
