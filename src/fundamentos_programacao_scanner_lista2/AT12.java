package fundamentos_programacao_scanner_lista2;
import java.util.Scanner;
public class AT12 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o saldo: ");
        double saldo = scanner.nextDouble();

        System.out.println("\n=========================");
        System.out.println("saldo >= 1000: " + (saldo >= 1000));
        System.out.println("saldo < 500: " + (saldo < 500));
        System.out.println("saldo == 850: " + (saldo == 850));
        System.out.println("saldo != 850: " + (saldo != 850));
        System.out.println("saldo > 100: " + (saldo > 100));
        System.out.println("=========================");
	}

}
