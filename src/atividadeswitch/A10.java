package atividadeswitch;
import java.util.Scanner;
public class A10 {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);

	        // Leitura do Curso
	        System.out.println("Escolha o Curso:");
	        System.out.println("1 → Informática");
	        System.out.println("2 → Administração");
	        System.out.println("3 → Engenharia");
	        System.out.print("Opção: ");
	        int curso = scanner.nextInt();

	        
	        System.out.println("\nEscolha a Disciplina (1, 2 ou 3):");
	        System.out.print("Opção: ");
	        int disciplina = scanner.nextInt();

	        System.out.println(); 

	        
	        switch (curso) {
	            case 1: 
	                
	                switch (disciplina) {
	                    case 1:
	                        System.out.println("Curso: Informática | Disciplina: Programação");
	                        break;
	                    case 2:
	                        System.out.println("Curso: Informática | Disciplina: Banco de Dados");
	                        break;
	                    case 3:
	                        System.out.println("Curso: Informática | Disciplina: Redes");
	                        break;
	                    default:
	                        System.out.println("Erro: Disciplina inválida para o curso de Informática.");
	                        break;
	                }
	                break; 

	            case 2: 
	               
	                switch (disciplina) {
	                    case 1:
	                        System.out.println("Curso: Administração | Disciplina: Marketing");
	                        break;
	                    case 2:
	                        System.out.println("Curso: Administração | Disciplina: Economia");
	                        break;
	                    case 3:
	                        System.out.println("Curso: Administração | Disciplina: Contabilidade");
	                        break;
	                    default:
	                        System.out.println("Erro: Disciplina inválida para o curso de Administração.");
	                        break;
	                }
	                break; 

	            case 3: 
	                
	                switch (disciplina) {
	                    case 1:
	                        System.out.println("Curso: Engenharia | Disciplina: Cálculo");
	                        break;
	                    case 2:
	                        System.out.println("Curso: Engenharia | Disciplina: Física");
	                        break;
	                    case 3:
	                        System.out.println("Curso: Engenharia | Disciplina: Desenho Técnico");
	                        break;
	                    default:
	                        System.out.println("Erro: Disciplina inválida para o curso de Engenharia.");
	                        break;
	                }
	                break; 

	            default:
	                System.out.println("Erro: Curso inválido.");
	                break;
	        }
	}

}
