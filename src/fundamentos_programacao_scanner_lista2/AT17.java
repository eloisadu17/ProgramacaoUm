package fundamentos_programacao_scanner_lista2;
import java.util.Scanner;
public class AT17 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a quantidade em estoque: ");
        int estoque = scanner.nextInt();

        String statusEstoque = (estoque < 5) ? "Estoque baixo" : "Estoque suficiente";

        System.out.println("\n=========================");
        System.out.println("Quantidade em estoque: " + estoque);
        System.out.println("Status: " + statusEstoque);
        System.out.println("=========================");
	}

}
