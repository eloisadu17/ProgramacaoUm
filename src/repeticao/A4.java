package repeticao;
import java.util.Scanner;
public class A4 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int numero = scanner.nextInt();

        int multiplicador = 1;

        while (multiplicador <= 10) {
            System.out.println(numero + " x " + multiplicador + " = " + (numero * multiplicador));
            multiplicador++;
        }
		
	}

}
