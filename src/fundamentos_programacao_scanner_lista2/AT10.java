package fundamentos_programacao_scanner_lista2;
import java.util.Scanner;
public class AT10 {

	public static void main(String[] args) {
		
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Digite o total de alunos: ");
	        int totalAlunos = scanner.nextInt();

	        System.out.print("Digite a quantidade de grupos: ");
	        int grupos = scanner.nextInt();

	        int divisaoInteira = totalAlunos / grupos;

	        double divisaoFlutuante = (double) totalAlunos / grupos;

	        System.out.println("\n=========================");
	        System.out.println("Quantidade inteira (divisão inteira): " + divisaoInteira);
	        System.out.println("Resultado em ponto flutuante: " + divisaoFlutuante);
	        System.out.println("=========================");
		
	}

}
