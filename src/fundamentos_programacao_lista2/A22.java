package fundamentos_programacao_lista2;

public class A22 {

	public static void main(String[] args) {
		String nomeProduto = "Notebook";
        double valorUnitario = 1250.00;
        int quantidade = 2;
        int parcelas = 5;

        double valorTotal = valorUnitario * quantidade;
        double valorParcela = valorTotal / parcelas;

        System.out.println("Nome do produto: " + nomeProduto);
        System.out.println("Valor unitário do produto: R$ " + String.format("%.2f", valorUnitario));
        System.out.println("Quantidade de produtos comprados: " + quantidade);
        System.out.println("Valor total da compra: R$ " + String.format("%.2f", valorTotal));
        System.out.println("Quantidade de parcelas: " + parcelas);
        System.out.println("Valor de cada parcela: R$ " + String.format("%.2f", valorParcela));
	}

}
