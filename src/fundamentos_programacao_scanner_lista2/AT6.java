package fundamentos_programacao_scanner_lista2;
import java.util.Scanner;
public class AT6 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a distância em quilômetros: ");
        double quilometros = scanner.nextDouble();

        double metros = quilometros * 1000;

        System.out.println("\n=========================");
        System.out.println("Distância em quilômetros: " + quilometros + " km");
        System.out.println("Distância em metros: " + String.format("%.0f", metros) + " m");
        System.out.println("=========================");
	}

}
