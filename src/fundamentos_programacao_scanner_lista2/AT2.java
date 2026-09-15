package fundamentos_programacao_scanner_lista2;
import java.util.Scanner;
public class AT2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a marca do veículo: ");
        String marca = scanner.nextLine();

        System.out.print("Digite o modelo do veículo: ");
        String modelo = scanner.nextLine();

        System.out.print("Digite o ano de fabricação: ");
        int anoFabricacao = scanner.nextInt();
        scanner.nextLine(); // Consome a quebra de linha restante

        System.out.print("Digite a cor do veículo: ");
        String cor = scanner.nextLine();

        System.out.print("Digite o valor do veículo (R$): ");
        double valor = scanner.nextDouble();

        System.out.print("É automático? (true/false): ");
        boolean ehAutomatico = scanner.nextBoolean();

        System.out.println("\n=========================");
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano de Fabricação: " + anoFabricacao);
        System.out.println("Cor: " + cor);
        System.out.println("Valor: R$ " + String.format("%.2f", valor));
        System.out.println("Automático: " + (ehAutomatico ? "Sim" : "Não"));
        System.out.println("=========================");
	}

}
