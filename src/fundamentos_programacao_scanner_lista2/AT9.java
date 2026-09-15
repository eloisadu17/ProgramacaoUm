package fundamentos_programacao_scanner_lista2;
import java.util.Scanner;
public class AT9 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número (x): ");
        int x = scanner.nextInt();

        System.out.print("Digite o segundo número (y): ");
        int y = scanner.nextInt();

        int divisaoInteira = x / y;

        double divisaoFlutuante = (double) x / y;

        System.out.println("\n=========================");
        System.out.println("Divisão inteira: " + divisaoInteira);
        System.out.println("Divisão em ponto flutuante: " + divisaoFlutuante);
        System.out.println("=========================");
	}

}
