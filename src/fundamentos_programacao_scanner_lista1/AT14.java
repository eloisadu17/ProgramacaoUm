package fundamentos_programacao_scanner_lista1;
import java.util.Scanner;
public class AT14 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nome do funcionário: ");
        String nome = scanner.nextLine();

        System.out.print("Digite o salário: ");
        double salario = scanner.nextDouble();

        System.out.print("Digite o tempo de empresa (anos): ");
        int tempoEmpresa = scanner.nextInt();

        double bonus = (tempoEmpresa >= 5) ? 500.0 : 0.0;
        double salarioFinal = salario + bonus;

        System.out.println("\nNome: " + nome);
        System.out.println("Salário: R$ " + String.format("%.2f", salario));
        System.out.println("Bônus: R$ " + String.format("%.2f", bonus));
        System.out.println("Salário Final: R$ " + String.format("%.2f", salarioFinal));
     	}

}
