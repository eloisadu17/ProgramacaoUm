package lista_arrays;
import java.util.Scanner;
public class A5 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        double[] valores = new double[10];

        System.out.println("Informe 10 valores (double):");
        for (int i = 0; i < valores.length; i++) {
            System.out.print("Valor " + (i + 1) + ": ");
            valores[i] = scanner.nextDouble();
        }

        double soma = 0;
        for (int i = 0; i < valores.length; i++) {
            soma += valores[i];
        }

        double media = soma / valores.length;

        double maior = valores[0];
        double menor = valores[0];
        for (int i = 1; i < valores.length; i++) {
            if (valores[i] > maior) {
                maior = valores[i];
            }
            if (valores[i] < menor) {
                menor = valores[i];
            }
        }

        int acimaDaMedia = 0;
        for (int i = 0; i < valores.length; i++) {
            if (valores[i] > media) {
                acimaDaMedia++;
            }
        }

        System.out.println("\n--- RESULTADOS ---");
        System.out.print("A. Todos os valores: ");
        for (int i = 0; i < valores.length; i++) {
            System.out.print(valores[i] + " ");
        }
        System.out.println();

        System.out.println("B. Soma dos valores: " + soma);
        System.out.printf("C. Média: %.2f\n", media);
        System.out.println("D. Maior valor: " + maior);
        System.out.println("E. Menor valor: " + menor);
        System.out.println("F. Quantidade de valores acima da média: " + acimaDaMedia);

        scanner.close();

	}

}
