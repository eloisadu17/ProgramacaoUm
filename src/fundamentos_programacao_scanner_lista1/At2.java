package fundamentos_programacao_scanner_lista1;
import java.util.Scanner;
public class At2 {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nome do produto: ");
        String nome = scanner.nextLine();

        System.out.print("Digite o código do produto: ");
        int codigo = scanner.nextInt();

        System.out.print("Digite o preço do produto: ");
        double preco = scanner.nextDouble();

        System.out.print("Digite a quantidade em estoque: ");
        int quantidadeEstoque = scanner.nextInt();

        System.out.println("\n=========================");
        System.out.println("Produto: " + nome);
        System.out.println("Código: " + codigo);
        System.out.println("Preço: R$ " + String.format("%.2f", preco));
        System.out.println("Quantidade em estoque: " + quantidadeEstoque + " unidades");
        System.out.println("=========================");
	}

}
