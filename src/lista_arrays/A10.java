package lista_arrays;
import java.util.Scanner;
public class A10 {

	public static void main(String[] args) {
		
Scanner scanner = new Scanner(System.in);
        
        double[][] notas = new double[5][4];
        double[] medias = new double[5];

        System.out.println("--- Entrada de Notas ---");
        for (int i = 0; i < notas.length; i++) {
            System.out.println("Aluno " + (i + 1) + ":");
            for (int j = 0; j < notas[i].length; j++) {
                System.out.printf("  Nota %d: ", (j + 1));
                notas[i][j] = scanner.nextDouble();
            }
        }

        double somaTurma = 0;
        int aprovados = 0;

        for (int i = 0; i < notas.length; i++) {
            double somaAluno = 0;
            for (int j = 0; j < notas[i].length; j++) {
                somaAluno += notas[i][j];
            }
            medias[i] = somaAluno / notas[i].length;
            somaTurma += medias[i];

            if (medias[i] >= 7.0) {
                aprovados++;
            }
        }

        System.out.println("\n--- Relatório de Alunos ---");
        for (int i = 0; i < notas.length; i++) {
            System.out.printf("Aluno %d - Média: %.1f\n", (i + 1), medias[i]);
        }

        double maiorMedia = medias[0];
        int alunoMaior = 1;
        double menorMedia = medias[0];
        int alunoMenor = 1;

        for (int i = 1; i < medias.length; i++) {
            if (medias[i] > maiorMedia) {
                maiorMedia = medias[i];
                alunoMaior = i + 1;
            }
            if (medias[i] < menorMedia) {
                menorMedia = medias[i];
                alunoMenor = i + 1;
            }
        }

        double mediaTurma = somaTurma / notas.length;

        System.out.println("\n--- Estatísticas Finais ---");
        System.out.printf("Maior média: Aluno %d - %.1f\n", alunoMaior, maiorMedia);
        System.out.printf("Menor média: Aluno %d - %.1f\n", alunoMenor, menorMedia);
        System.out.printf("Média da turma: %.2f\n", mediaTurma);
        System.out.println("Alunos aprovados: " + aprovados);

        scanner.close();
		
	}

}
