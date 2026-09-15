package fundamentos_programacao_scanner_lista1;
import java.util.Scanner;
public class AT12 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a idade: ");
        int idade = scanner.nextInt();

        String resultado = (idade >= 18) ? "Maior de idade" : "Menor de idade";

        System.out.println("Resultado: " + resultado);
	}

}
