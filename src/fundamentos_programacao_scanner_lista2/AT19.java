package fundamentos_programacao_scanner_lista2;
import java.util.Scanner;
public class AT19 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o saldo (R$): ");
        double saldo = scanner.nextDouble();

        String situacao = (saldo > 0) ? "Saldo positivo" : "Saldo negativo";

        System.out.println("\n=========================");
        System.out.println("Saldo: R$ " + String.format("%.2f", saldo));
        System.out.println("Situação: " + situacao);
        System.out.println("=========================");
	}

}
