package lista_arrays;
import java.util.Scanner;
import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
	
		Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[10];

        System.out.println("Informe 10 números inteiros:");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
        }

        int maior = numeros[0];
        int posMaior = 0;
        int menor = numeros[0];
        int posMenor = 0;

        System.out.println("\nValores:");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i] + " ");
        }
        System.out.println(); 

        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] > maior) {
                maior = numeros[i];
                posMaior = i;
            }
            if (numeros[i] < menor) {
                menor = numeros[i];
                posMenor = i;
            }
        }

        System.out.println("Maior valor: " + maior);
        System.out.println("Posição do maior: " + posMaior);
        System.out.println("Menor valor: " + menor);
        System.out.println("Posição do menor: " + posMenor);

        scanner.close();

	}

}