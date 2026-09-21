package lista_arrays;
import java.util.Scanner;
public class A4 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[15];

        System.out.println("Informe 15 números inteiros:");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
        }

        int pares = 0;
        int impares = 0;
        int maioresQue10 = 0;
        int menoresOuIguais10 = 0;

        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] % 2 == 0) {
                pares++;
            } else {
                impares++;
            }

            if (numeros[i] > 10) {
                maioresQue10++;
            } else {
                menoresOuIguais10++;
            }
        }

        System.out.println("\n--- Resultados ---");
        System.out.println("Quantidade de pares: " + pares);
        System.out.println("Quantidade de ímpares: " + impares);
        System.out.println("Maiores que 10: " + maioresQue10);
        System.out.println("Menores ou iguais a 10: " + menoresOuIguais10);

        scanner.close();
	}

}
