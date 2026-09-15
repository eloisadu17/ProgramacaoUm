package atividadeswitch;
import java.util.Scanner;
public class A2 {

	public static void main(String[] args) {
		   Scanner scanner = new Scanner(System.in);

	        System.out.print("Digite o primeiro número inteiro: ");
	        int num1 = scanner.nextInt();

	        System.out.print("Digite o segundo número inteiro: ");
	        int num2 = scanner.nextInt();

	        
	        System.out.println("\nEscolha uma operação:");
	        System.out.println("1 → Soma");
	        System.out.println("2 → Subtração");
	        System.out.println("3 → Multiplicação");
	        System.out.println("4 → Divisão");
	        System.out.print("Opção: ");
	        int opcao = scanner.nextInt();

	        switch (opcao) {
	            case 1:
	                int soma = num1 + num2;
	                System.out.println("Resultado da Soma: " + soma);
	                break;
	            case 2:
	                int subtracao = num1 - num2;
	                System.out.println("Resultado da Subtração: " + subtracao);
	                break;
	            case 3:
	                int multiplicacao = num1 * num2;
	                System.out.println("Resultado da Multiplicação: " + multiplicacao);
	                break;
	            case 4:
	                if (num2 != 0) {
	                    double divisao = (double) num1 / num2;
	                    System.out.println("Resultado da Divisão: " + divisao);
	                } else {
	                    System.out.println("Erro: Não é possível dividir por zero.");
	                }
	                break;
	            default:
	                System.out.println("Opção inválida.");
	                break;
	        }
	}

}
