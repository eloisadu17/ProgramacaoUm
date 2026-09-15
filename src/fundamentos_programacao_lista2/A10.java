package fundamentos_programacao_lista2;

public class A10 {

	public static void main(String[] args) {
		int totalAlunos = 23;
        int grupos = 5;

        int divisaoInteira = totalAlunos / grupos;

        double divisaoFlutuante = (double) totalAlunos / grupos;

        System.out.println("Quantidade inteira: " + divisaoInteira);
        System.out.println("Divisão em ponto flutuante: " + divisaoFlutuante);
	}

}
