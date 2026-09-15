package repeticao;
import java.util.Scanner;
public class A7 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        int senha;

        System.out.print("Digite a senha: ");
        senha = scanner.nextInt();

        while (senha != 1234) {
            System.out.print("DIGITE A SENHA NOVAMENTE: ");
            senha = scanner.nextInt();
        }

        System.out.println("SENHA CERTA!");
        System.out.println("Acesso permitido.");
	}

}
