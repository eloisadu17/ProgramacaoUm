package fudamentos_programacao_lista1;

public class Atividade9 {

	public static void main(String[] args) {
		boolean possuiIngresso = true;
        boolean possuiDocumento = false;
        boolean acompanhanteMaiorIdade = true;

        boolean res1 = possuiIngresso && possuiDocumento;

        boolean res2 = possuiIngresso || possuiDocumento;

        boolean res3 = !possuiDocumento;

        boolean res4 = possuiIngresso && (possuiDocumento || acompanhanteMaiorIdade);

        boolean res5 = !(possuiIngresso && possuiDocumento);

        System.out.println("possuiIngresso && possuiDocumento: " + res1);
        System.out.println("possuiIngresso || possuiDocumento: " + res2);
        System.out.println("!possuiDocumento: " + res3);
        System.out.println("possuiIngresso && (possuiDocumento || acompanhanteMaiorIdade): " + res4);
        System.out.println("!(possuiIngresso && possuiDocumento): " + res5);
	}

}
