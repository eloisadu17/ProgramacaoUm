package repeticao;
import java.util.Scanner;
public class A6 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o número inicial: ");
        int inicio = scanner.nextInt();

        System.out.print("Digite o número final: ");
        int fim = scanner.nextInt();

        int numero = inicio;

        while (numero <= fim) {
            System.out.println(numero);
            numero++;
        }
	}

}
