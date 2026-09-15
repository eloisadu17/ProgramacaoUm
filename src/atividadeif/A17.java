package atividadeif;

import java.util.Scanner;

public class A17 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o usuário: ");
        String usuario = scanner.nextLine();

        System.out.print("Digite a senha: ");
        String senha = scanner.nextLine();

        System.out.println("\n=========================");
        if (!usuario.equals("admin")) {
            System.out.println("Usuário inexistente.");
        } else if (senha.equals("1234")) {
            System.out.println("Acesso permitido.");
        } else {
            System.out.println("Senha incorreta.");
        }
        System.out.println("=========================");
	}

}
