package atividadeswitch;
import java.util.Scanner;
public class A8 {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);

	        
	        System.out.println("Escolha a Sala:");
	        System.out.println("1 → Sala 1");
	        System.out.println("2 → Sala 2");
	        System.out.print("Opção: ");
	        int sala = scanner.nextInt();

	        
	        System.out.println("\nEscolha o Filme (1, 2 ou 3):");
	        System.out.print("Opção: ");
	        int filme = scanner.nextInt();

	        System.out.println();

	        switch (sala) {
	            case 1: 
	                switch (filme) {
	                    case 1:
	                        System.out.println("Sala 1 | Filme: Aventura");
	                        break;
	                    case 2:
	                        System.out.println("Sala 1 | Filme: Comédia");
	                        break;
	                    case 3:
	                        System.out.println("Sala 1 | Filme: Ficção Científica");
	                        break;
	                    default:
	                        System.out.println("Filme inválido para a Sala 1.");
	                        break;
	                }
	                break; 

	            case 2: 
	                
	                switch (filme) {
	                    case 1:
	                        System.out.println("Sala 2 | Filme: Terror");
	                        break;
	                    case 2:
	                        System.out.println("Sala 2 | Filme: Romance");
	                        break;
	                    case 3:
	                        System.out.println("Sala 2 | Filme: Animação");
	                        break;
	                    default:
	                        System.out.println("Filme inválido para a Sala 2.");
	                        break;
	                }
	                break; 

	            default:
	                System.out.println("Sala inválida.");
	                break;
	        }
	}

}
