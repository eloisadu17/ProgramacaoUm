package atividadeswitch;
import java.util.Scanner;
public class A6 {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);

	        // Leitura do Turno
	        System.out.println("Escolha o Turno:");
	        System.out.println("1 → Manhã");
	        System.out.println("2 → Tarde");
	        System.out.print("Opção: ");
	        int turno = scanner.nextInt();

	        // Leitura da Disciplina
	        System.out.println("\nEscolha a Disciplina (1, 2 ou 3):");
	        System.out.print("Opção: ");
	        int disciplina = scanner.nextInt();

	        System.out.println();
	        switch (turno) {
	            case 1: 
	                switch (disciplina) {
	                    case 1:
	                        System.out.println("Turno: Manhã | Disciplina: Matemática");
	                        break;
	                    case 2:
	                        System.out.println("Turno: Manhã | Disciplina: Português");
	                        break;
	                    case 3:
	                        System.out.println("Turno: Manhã | Disciplina: Física");
	                        break;
	                    default:
	                        System.out.println("Disciplina inválida para o turno da manhã.");
	                        break;
	                }
	                break; 
	            case 2: 
	                
	                switch (disciplina) {
	                    case 1:
	                        System.out.println("Turno: Tarde | Disciplina: História");
	                        break;
	                    case 2:
	                        System.out.println("Turno: Tarde | Disciplina: Geografia");
	                        break;
	                    case 3:
	                        System.out.println("Turno: Tarde | Disciplina: Biologia");
	                        break;
	                    default:
	                        System.out.println("Disciplina inválida para o turno da tarde.");
	                        break;
	                }
	                break; 

	            default:
	                System.out.println("Turno inválido.");
	                break;
	        }
	}

}
