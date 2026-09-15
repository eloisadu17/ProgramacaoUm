package fundamentos_programacao_scanner_lista2;
import java.util.Scanner;
public class AT14 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        System.out.print("Está chovendo? (true/false): ");
        boolean chovendo = scanner.nextBoolean();

        System.out.print("Tem guarda-chuva? (true/false): ");
        boolean guardaChuva = scanner.nextBoolean();

        System.out.print("Tem carro disponível? (true/false): ");
        boolean carroDisponivel = scanner.nextBoolean();

        System.out.println("\n=========================");

        System.out.println("chovendo && guardaChuva: " + (chovendo && guardaChuva));

        System.out.println("guardaChuva || carroDisponivel: " + (guardaChuva || carroDisponivel));

        System.out.println("!chovendo: " + (!chovendo));

        System.out.println("chovendo && (guardaChuva || carroDisponivel): " + (chovendo && (guardaChuva || carroDisponivel)));

        System.out.println("!(chovendo && guardaChuva): " + (!(chovendo && guardaChuva)));

        System.out.println("=========================");
	}

}
