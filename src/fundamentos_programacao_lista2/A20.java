package fundamentos_programacao_lista2;

public class A20 {

	public static void main(String[] args) {
		int idade = 70;

        String tipoAtendimento = (idade >= 60) ? "Atendimento preferencial" : "Atendimento comum";

        System.out.println("Idade: " + idade + " anos");
        System.out.println("Tipo de atendimento: " + tipoAtendimento);
	}

}
