package fundamentos_programacao_scanner_lista1;
import java.util.Scanner;
public class AT8 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número inteiro (numA): ");
        int numA = scanner.nextInt();

        System.out.print("Digite o segundo número inteiro (numB): ");
        int numB = scanner.nextInt();

        int divisaoInteira = numA / numB;
        double divisaoFlutuante = (double) numA / numB;

        System.out.println("\nDivisão inteira: " + divisaoInteira);
        System.out.println("Divisão em ponto flutuante: " + divisaoFlutuante);
	}

}
