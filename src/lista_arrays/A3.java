package lista_arrays;
import java.util.Scanner;
public class A3 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
        String[] alunos = new String[8];

        System.out.println("--- Cadastro de Alunos ---");
        for (int i = 0; i < alunos.length; i++) {
            System.out.print("Informe o nome do aluno " + (i + 1) + ": ");
            alunos[i] = scanner.nextLine();
        }

        System.out.print("\nDigite o nome do aluno que deseja pesquisar: ");
        String nomePesquisado = scanner.nextLine();

        boolean encontrado = false;
        int posicao = -1;

        for (int i = 0; i < alunos.length; i++) {
            if (alunos[i].equalsIgnoreCase(nomePesquisado)) {
                encontrado = true;
                posicao = i;
                break; 
            }
        }

        if (encontrado) {
            System.out.println("Aluno encontrado na posição: " + posicao);
        } else {
            System.out.println("Aluno não encontrado.");
        }

        scanner.close();

	}

}
