package atividadeswitch;
import java.util.Scanner;
public class A7 {

	public static void main(String[] args) {
		  Scanner scanner = new Scanner(System.in);

	        System.out.println("Escolha o Setor:");
	        System.out.println("1 → Bebidas");
	        System.out.println("2 → Lanches");
	        System.out.print("Opção: ");
	        int setor = scanner.nextInt();

	        System.out.println("\nEscolha o Produto (1, 2 ou 3):");
	        System.out.print("Opção: ");
	        int produto = scanner.nextInt();

	        System.out.println(); 

	       
	        switch (setor) {
	            case 1: 
	                
	                switch (produto) {
	                    case 1:
	                        System.out.println("Setor: Bebidas | Item: Água");
	                        break;
	                    case 2:
	                        System.out.println("Setor: Bebidas | Item: Refrigerante");
	                        break;
	                    case 3:
	                        System.out.println("Setor: Bebidas | Item: Suco");
	                        break;
	                    default:
	                        System.out.println("Produto inválido para o setor de Bebidas.");
	                        break;
	                }
	                break; 

	            case 2: 
	                switch (produto) {
	                    case 1:
	                        System.out.println("Setor: Lanches | Item: Cachorro-quente");
	                        break;
	                    case 2:
	                        System.out.println("Setor: Lanches | Item: Hambúrguer");
	                        break;
	                    case 3:
	                        System.out.println("Setor: Lanches | Item: Pizza");
	                        break;
	                    default:
	                        System.out.println("Produto inválido para o setor de Lanches.");
	                        break;
	                }
	                break; 

	            default:
	                System.out.println("Setor inválido.");
	                break;
	        }
	}

}
