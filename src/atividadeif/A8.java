package atividadeif;

import java.util.Scanner;

public class A8 {

	public static void main(String[] args) {
	int num1 = 0;
	
	
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("digite idade");
		num1 = leia.nextInt();
		
		
		if(num1>=18)
		{
			System.out.println("adulto");
		
		}
		else
		{
			System.out.println("de menor");
		}
	}

}
