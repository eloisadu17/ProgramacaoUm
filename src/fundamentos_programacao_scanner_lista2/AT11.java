package fundamentos_programacao_scanner_lista2;
import java.util.Scanner;
public class AT11 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a temperatura: ");
        int temperatura = scanner.nextInt();

        System.out.println("\n=========================");
        System.out.println("temperatura > 25: " + (temperatura > 25));
        System.out.println("temperatura <= 30: " + (temperatura <= 30));
        System.out.println("temperatura == 20: " + (temperatura == 20));
        System.out.println("temperatura != 30: " + (temperatura != 30));
        System.out.println("=========================");
		
	}

}
