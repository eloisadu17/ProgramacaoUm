package atividadeif;

import java.util.Scanner;

public class A6 {

	public static void main(String[] args) {
	int num1 = 0;
	
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("digite 2 numeros");
		num1 = leia.nextInt();
		
		
		if(num1/2==0)
		{
			System.out.println("par");
		
		}
		else
		{
			System.out.println("impar");
		}
		
	}

}
