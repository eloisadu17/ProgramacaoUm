package repeticao;
import java.util.Scanner;
public class A10 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        
        double somaNotas = 0;
        int quantidadeAlunos = 0;
        char resposta = 'S';

        while (resposta == 'S' || resposta == 's') {
            System.out.print("Informe o nome do aluno: ");
            String nome = scanner.next();

            System.out.print("Informe a nota de " + nome + ": ");
            double nota = scanner.nextDouble();

            somaNotas += nota;
            quantidadeAlunos++;

            System.out.print("Deseja cadastrar outro aluno? (S/N): ");
            resposta = scanner.next().charAt(0);
            System.out.println();
        }

        if (quantidadeAlunos > 0) {
            double media = somaNotas / quantidadeAlunos;
            System.out.println("Média das notas informadas: " + media);
        } else {
            System.out.println("Nenhum aluno foi cadastrado.");
        }
		
	}

}
