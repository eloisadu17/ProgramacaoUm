package fundamentos_programacao_scanner_lista2;
import java.util.Scanner;
public class AT22 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nome do produto: ");
        String nomeProduto = scanner.nextLine();

        System.out.print("Digite o valor unitário (R$): ");
        double valorUnitario = scanner.nextDouble();

        System.out.print("Digite a quantidade comprada: ");
        int quantidade = scanner.nextInt();

        System.out.print("Digite a quantidade de parcelas: ");
        int parcelas = scanner.nextInt();

        double valorTotal = valorUnitario * quantidade;
        double valorParcela = valorTotal / parcelas;

        System.out.println("\n=========================");
        System.out.println("Produto: " + nomeProduto);
        System.out.println("Valor unitário: R$ " + String.format("%.2f", valorUnitario));
        System.out.println("Quantidade: " + quantidade);
        System.out.println("Valor total da compra: R$ " + String.format("%.2f", valorTotal));
        System.out.println("Quantidade de parcelas: " + parcelas);
        System.out.println("Valor de cada parcela: R$ " + String.format("%.2f", valorParcela));
        System.out.println("=========================");
	}

}
