package fundamentos_programacao_scanner_lista1;
import java.util.Scanner;
public class AT13 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a temperatura (°C): ");
        double temperatura = scanner.nextDouble();

        String situacao = (temperatura > 25) ? "Dia quente" : "Dia agradável";

        System.out.println("Temperatura: " + temperatura + "°C");
        System.out.println("Situação: " + situacao);
	}

}
