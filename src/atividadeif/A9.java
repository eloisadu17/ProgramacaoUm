package atividadeif;

import java.util.Scanner;

public class A9 {

	public static void main(String[] args) {
	int num1 = 0;
	int num2 =0;
	
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("digite 2 numeros");
		num1 = leia.nextInt();
		num2 = leia.nextInt();
		
		
		if(num1>num2)
		{
			System.out.println("numero 1 maior");
		
		}
		else
		{
			System.out.println("numero 2 maior");
		}
	}

}
