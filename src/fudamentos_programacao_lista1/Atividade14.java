package fudamentos_programacao_lista1;

public class Atividade14 {

	public static void main(String[] args) {
		String nome = "Carlos Silva";
        double salario = 3200.00;
        int tempoEmpresa = 6;

        double bonus = (tempoEmpresa >= 5) ? 500.00 : 0.00;

        double salarioFinal = salario + bonus;

        System.out.println("Nome: " + nome);
        System.out.println("Salário: R$ " + salario);
        System.out.println("Bônus: R$ " + bonus);
        System.out.println("Salário Final: R$ " + salarioFinal);
	}

}
