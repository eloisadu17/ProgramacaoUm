package fundamentos_programacao_scanner_lista1;
import java.util.Scanner;
public class AT6 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor do monitor em dólares: ");
        double valorEmDolares = scanner.nextDouble();

        System.out.print("Digite a cotação do dólar em reais: ");
        double cotacaoDolar = scanner.nextDouble();

        double valorEmReais = valorEmDolares * cotacaoDolar;

        System.out.println("O monitor custa " + String.format("%.2f", valorEmReais) + " reais");
	}

}
