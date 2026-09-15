package fundamentos_programacao_lista2;

public class A16 {

	public static void main(String[] args) {
		String funcionario = "Carlos";
        String cargo = "Analista";
        double salario = 4200.00;

        System.out.println("*************************");
        System.out.println("Funcionário: " + funcionario);
        System.out.println("Cargo: " + cargo);
        System.out.println("Salário: R$ " + String.format("%.2f", salario));
        System.out.println("*************************");
	}

}
