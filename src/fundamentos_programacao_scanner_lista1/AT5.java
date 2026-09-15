package fundamentos_programacao_scanner_lista1;
import java.util.Scanner;
public class AT5 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor do arroz: ");
        double arroz = scanner.nextDouble();

        System.out.print("Digite o valor do feijão: ");
        double feijao = scanner.nextDouble();

        System.out.print("Digite o valor do óleo: ");
        double oleo = scanner.nextDouble();

        double valorTotal = arroz + feijao + oleo;
        double valorMedio = valorTotal / 3;

        System.out.println("\n=========================");
        System.out.println("Valor total da compra: R$ " + String.format("%.2f", valorTotal));
        System.out.println("Valor médio dos produtos: R$ " + String.format("%.2f", valorMedio));
        System.out.println("=========================");
	}

}
