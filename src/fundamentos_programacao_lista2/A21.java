package fundamentos_programacao_lista2;

public class A21 {

	public static void main(String[] args) {
		String nome = "João Gomes";
        double salarioBase = 2500.00;
        int horasExtras = 8;
        double valorPorHoraExtra = 35.00;
        double valorHorasExtras = horasExtras * valorPorHoraExtra;
        double salarioFinal = salarioBase + valorHorasExtras;

        System.out.println("Nome: " + nome);
        System.out.println("Salário base: R$ " + String.format("%.2f", salarioBase));
        System.out.println("Valor das horas extras: R$ " + String.format("%.2f", valorHorasExtras));
        System.out.println("Salário final: R$ " + String.format("%.2f", salarioFinal));
	}

}
