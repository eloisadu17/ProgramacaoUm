package repeticao;
import java.util.Scanner;
public class A15 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        double soma = 0;

        for (int i = 1; i <= 5; i++) 
        {
            System.out.print("Digite a " + i + "ª nota:(DIGITE NUMERTOS DEGATIVOS PARA ENCERRAR A SOMA) ");
            soma += scanner.nextDouble();
        }

        double media = soma / 5;

        System.out.println("Soma das notas: " + soma);
        System.out.println("Média das notas: " + media);
	}

}
