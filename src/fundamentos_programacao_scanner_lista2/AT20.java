package fundamentos_programacao_scanner_lista2;
import java.util.Scanner;
public class AT20 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a idade: ");
        int idade = scanner.nextInt();

        String tipoAtendimento = (idade >= 60) ? "Atendimento preferencial" : "Atendimento comum";

        System.out.println("\n=========================");
        System.out.println("Idade: " + idade + " anos");
        System.out.println("Tipo de atendimento: " + tipoAtendimento);
        System.out.println("=========================");
	}

}
