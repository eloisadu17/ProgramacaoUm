package fundamentos_programacao_scanner_lista1;
import java.util.Scanner;
public class AT7 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor do salário: ");
        double salario = scanner.nextDouble();
        
        int salarioInteiro = (int) salario;
        double salarioDoubleNovamente = (double) salarioInteiro;

        System.out.println("\nSalário original (double): " + salario);
        System.out.println("Parte inteira (int): " + salarioInteiro);
        System.out.println("Convertido novamente (double): " + salarioDoubleNovamente);
	}

}
