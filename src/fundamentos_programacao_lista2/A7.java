package fundamentos_programacao_lista2;

public class A7 {

	public static void main(String[] args) {
		double nota = 8.95;

        int notaInteira = (int) nota;

        double notaNovamenteDouble = notaInteira;

        System.out.println("Valor inicial (double): " + nota);
        System.out.println("Convertido para int: " + notaInteira);
        System.out.println("Convertido novamente para double: " + notaNovamenteDouble);
	}

}
