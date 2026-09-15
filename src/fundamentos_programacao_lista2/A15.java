package fundamentos_programacao_lista2;

public class A15 {

	public static void main(String[] args) {
		String produto = "Notebook";
        double preco = 3500.00;
        int estoque = 18;

        System.out.println("=========================");
        System.out.println("Produto: " + produto);
        System.out.println("Preço: R$ " + String.format("%.2f", preco));
        System.out.println("Estoque: " + estoque + " unidades");
        System.out.println("=========================");
	}

}
