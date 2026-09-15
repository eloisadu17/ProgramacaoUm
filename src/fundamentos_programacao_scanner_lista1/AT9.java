package fundamentos_programacao_scanner_lista1;
import java.util.Scanner;
public class AT9 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        System.out.print("Possui ingresso? (true/false): ");
        boolean possuiIngresso = scanner.nextBoolean();

        System.out.print("Possui documento? (true/false): ");
        boolean possuiDocumento = scanner.nextBoolean();

        System.out.print("Está acompanhado de um maior de idade? (true/false): ");
        boolean acompanhanteMaiorIdade = scanner.nextBoolean();

        boolean exp1 = possuiIngresso && possuiDocumento;
        boolean exp2 = possuiIngresso || possuiDocumento;
        boolean exp3 = !possuiDocumento;
        boolean exp4 = possuiIngresso && (possuiDocumento || acompanhanteMaiorIdade);
        boolean exp5 = !(possuiIngresso && possuiDocumento);

        System.out.println("\n================ RESPOSTAS ================");
        
        System.out.println("1) possuiIngresso && possuiDocumento -> " + exp1);

        System.out.println("2) possuiIngresso || possuiDocumento -> " + exp2);

        System.out.println("3) !possuiDocumento -> " + exp3);

        System.out.println("4) possuiIngresso && (possuiDocumento || acompanhanteMaiorIdade) -> " + exp4);

        System.out.println("5) !(possuiIngresso && possuiDocumento) -> " + exp5);

        System.out.println("===========================================");
	}

}
