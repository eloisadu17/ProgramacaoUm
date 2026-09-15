package fundamentos_programacao_scanner_lista2;
import java.util.Scanner;
public class AT16 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nome do funcionário: ");
        String funcionario = scanner.nextLine();

        System.out.print("Digite o cargo: ");
        String cargo = scanner.nextLine();

        System.out.print("Digite o salário (R$): ");
        double salario = scanner.nextDouble();

        System.out.println("\n*************************");
        System.out.println("Funcionário: " + funcionario);
        System.out.println("Cargo: " + cargo);
        System.out.println("Salário: R$ " + String.format("%.2f", salario));
        System.out.println("*************************");
	}

}
