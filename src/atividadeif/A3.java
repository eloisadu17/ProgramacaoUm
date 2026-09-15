package atividadeif;

import java.util.Scanner;

public class A3 {

	public static void main(String[] args) {

		int num= 0;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("digite sua idade");
		num= leia.nextInt();
		
		if(num>=18)
		{
			System.out.println("vc e adulto");
		}

	}

}
