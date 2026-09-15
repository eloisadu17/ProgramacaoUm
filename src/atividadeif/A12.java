package atividadeif;

import java.util.Scanner;

public class A12 {

	public static void main(String[] args) {
	int num = 0;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("digite sua idade");
		num = leia.nextInt();
		
		if(num<=12)
		{
			System.out.println("criança");
		
		}
		else if (num<=17)
		{
			System.out.println("adolescente");
		}
		else if (num<=59)
		{
			System.out.println("adulto");
		}
		else
		{
			System.out.println("idoso");
		}

	}

}
