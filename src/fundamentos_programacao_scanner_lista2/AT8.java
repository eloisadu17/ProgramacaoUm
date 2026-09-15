package fundamentos_programacao_scanner_lista2;
import java.util.Scanner;
public class AT8 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a temperatura (ex: 26,78): ");
        double temperaturaInicial = scanner.nextDouble();

        int temperaturaInteira = (int) temperaturaInicial;

        double temperaturaDoubleConvertida = temperaturaInteira;

        System.out.println("\n=========================");
        System.out.println("Temperatura inicial (double): " + temperaturaInicial);
        System.out.println("Convertida para int: " + temperaturaInteira);
        System.out.println("Convertida para double novamente: " + temperaturaDoubleConvertida);
        System.out.println("=========================");
	}

}
