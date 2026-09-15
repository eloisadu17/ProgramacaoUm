package atividadeif;

import java.util.Scanner;

public class A15 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o peso (kg): ");
        double peso = scanner.nextDouble();

        System.out.print("Digite a altura (m): ");
        double altura = scanner.nextDouble();

        double imc = peso / (altura * altura);

        String classificacao;

        if (imc < 18.5) {
            classificacao = "Magreza / Abaixo do peso";
        } else if (imc <= 24.9) {
            classificacao = "Peso normal / Saudável";
        } else if (imc <= 29.9) {
            classificacao = "Sobrepeso (Pré-obesidade)";
        } else if (imc <= 34.9) {
            classificacao = "Obesidade Grau I";
        } else if (imc <= 39.9) {
            classificacao = "Obesidade Grau II";
        } else {
            classificacao = "Obesidade Grau III (Grave)";
        }

        System.out.println("\n=========================");
        System.out.println("IMC: " + String.format("%.2f", imc));
        System.out.println("Classificação: " + classificacao);
        System.out.println("=========================");
	}

}
