package fundamentos_programacao_scanner_lista2;
import java.util.Scanner;
public class AT3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a distância percorrida (km): ");
        double distancia = scanner.nextDouble();

        System.out.print("Digite o combustível consumido (litros): ");
        double litros = scanner.nextDouble();

        double consumoMedio = distancia / litros;
        double litrosPara100Km = 100 / consumoMedio;

        System.out.println("\n=========================");
        System.out.println("Consumo médio: " + String.format("%.2f", consumoMedio) + " km/l");
        System.out.println("Litros necessários para 100 km: " + String.format("%.2f", litrosPara100Km) + " L");
        System.out.println("=========================");
	}

}
