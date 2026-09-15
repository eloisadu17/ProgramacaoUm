package repeticao;
import java.util.Scanner;
public class A9 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        int opcao = -1;

        while (opcao != 0) {
            System.out.println("===== MENU =====");
            System.out.println("1 - Cadastrar");
            System.out.println("2 - Consultar");
            System.out.println("3 - Excluir");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");
            
            opcao = scanner.nextInt();

            if (opcao == 0) {
                System.out.println("Programa encerrado");
            } else {
                System.out.println();
            }
        }
	}

}
