package lista_arrays;
import java.util.Scanner;
public class A7 {

	public static void main(String[] args) {
		
		        Scanner scanner = new Scanner(System.in);

		        int[][] matriz = new int[4][4];

		        System.out.println("--- Preenchimento da Matriz 4x4 ---");
		        for (int i = 0; i < matriz.length; i++) {
		            for (int j = 0; j < matriz[i].length; j++) {
		                System.out.printf("Digite o valor para [%d][%d]: ", i, j);
		                matriz[i][j] = scanner.nextInt();
		            }
		        }

		        int soma = 0;
		        int maior = matriz[0][0];
		        int menor = matriz[0][0];

		        for (int i = 0; i < matriz.length; i++) {
		            for (int j = 0; j < matriz[i].length; j++) {
		                int valorAtual = matriz[i][j];

		                soma += valorAtual;

		                if (valorAtual > maior) {
		                    maior = valorAtual;
		                }

		                if (valorAtual < menor) {
		                    menor = valorAtual;
		                }
		            }
		        }

		        int totalElementos = matriz.length * matriz[0].length;
		        double media = (double) soma / totalElementos;

		        System.out.println("\n--- Matriz Informada ---");
		        for (int i = 0; i < matriz.length; i++) {
		            for (int j = 0; j < matriz[i].length; j++) {
		                System.out.print(matriz[i][j] + "\t"); 
		            }
		            System.out.println(); 
		        }

		        System.out.println("\n--- Resultados ---");
		        System.out.println("Soma de todos os elementos: " + soma);
		        System.out.printf("Média dos elementos: %.2f\n", media);
		        System.out.println("Maior elemento: " + maior);
		        System.out.println("Menor elemento: " + menor);

		        scanner.close();

	}

}
