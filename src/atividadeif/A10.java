package atividadeif;

import java.util.Scanner;

public class A10 {

	public static void main(String[] args) {
	int num = 0;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("digite temperatura");
		num = leia.nextInt();
		
		if(num>=30)
		{
			System.out.println("agradavel");
		
		}
		else
		{
			System.out.println("desagradavel");
		}

	}

}
