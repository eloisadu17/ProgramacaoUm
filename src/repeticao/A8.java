package repeticao;
import java.util.Scanner;
public class A8 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
        int soma = 0;
        int contador = 1;

        while (contador <= 5) {
            System.out.print("Digite o " + contador + "º número: ");
            soma += scanner.nextInt();
            contador++;
        }

        System.out.println("A soma de todos os números é: " + soma);
		
	}

}
