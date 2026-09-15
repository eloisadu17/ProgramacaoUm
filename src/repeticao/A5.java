package repeticao;
import java.util.Scanner;
public class A5 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
        int soma = 0;

        System.out.print("Digite um número: ");
        int numero = scanner.nextInt();

        while (numero >= 0) {
            soma += numero;
            System.out.print("Digite um número: ");
            numero = scanner.nextInt();
        }

        System.out.println("Soma = " + soma);
		
	}

}
