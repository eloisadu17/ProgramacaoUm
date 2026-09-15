package fundamentos_programacao_scanner_lista2;
import java.util.Scanner;
public class AT15 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nome do produto: ");
        String produto = scanner.nextLine();

        System.out.print("Digite o preço (R$): ");
        double preco = scanner.nextDouble();

        System.out.print("Digite a quantidade em estoque: ");
        int estoque = scanner.nextInt();

        System.out.println("\n=========================");
        System.out.println("Produto: " + produto);
        System.out.println("Preço: R$ " + String.format("%.2f", preco));
        System.out.println("Estoque: " + estoque + " unidades");
        System.out.println("=========================");
		
	}

}
