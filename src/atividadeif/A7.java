package atividadeif;

import java.util.Scanner;

public class A7 {

	public static void main(String[] args) {
	int num1 = 0;
	
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("digite media");
		num1 = leia.nextInt();
		
		
		if(num1>=7)
		{
			System.out.println("aprovado");
		
		}
		else
		{
			System.out.println("reprovado");
		}
	}

}
