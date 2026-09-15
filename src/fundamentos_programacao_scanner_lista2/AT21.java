package fundamentos_programacao_scanner_lista2;
import java.util.Scanner;
public class AT21 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nome do funcionário: ");
        String nome = scanner.nextLine();

        System.out.print("Digite o salário base (R$): ");
        double salarioBase = scanner.nextDouble();

        System.out.print("Digite a quantidade de horas extras trabalhadas: ");
        int horasExtras = scanner.nextInt();

        double valorHorasExtras = horasExtras * 35.0;
        double salarioFinal = salarioBase + valorHorasExtras;

        System.out.println("\n=========================");
        System.out.println("Funcionário: " + nome);
        System.out.println("Salário Base: R$ " + String.format("%.2f", salarioBase));
        System.out.println("Horas Extras Trabalhadas: " + horasExtras);
        System.out.println("Valor Total das Horas Extras: R$ " + String.format("%.2f", valorHorasExtras));
        System.out.println("Salário Final: R$ " + String.format("%.2f", salarioFinal));
        System.out.println("=========================");
	}

}
