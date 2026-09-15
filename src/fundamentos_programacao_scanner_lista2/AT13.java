package fundamentos_programacao_scanner_lista2;
import java.util.Scanner;
public class AT13 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Possui CNH? (true/false): ");
        boolean possuiCNH = scanner.nextBoolean();

        System.out.print("Possui carro? (true/false): ");
        boolean possuiCarro = scanner.nextBoolean();

        System.out.print("Possui dinheiro? (true/false): ");
        boolean possuiDinheiro = scanner.nextBoolean();

        System.out.println("\n=========================");

        System.out.println("possuiCNH && possuiCarro: " + (possuiCNH && possuiCarro));

        System.out.println("possuiCarro || possuiDinheiro: " + (possuiCarro || possuiDinheiro));

        System.out.println("!possuiCNH: " + (!possuiCNH));

        System.out.println("possuiCNH && possuiDinheiro: " + (possuiCNH && possuiDinheiro));

        System.out.println("!(possuiCarro || possuiDinheiro): " + (!(possuiCarro || possuiDinheiro)));

        System.out.println("=========================");
		
	}

}
