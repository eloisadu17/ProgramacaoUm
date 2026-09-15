package atividadeif;

import java.util.Scanner;

public class A11 {

	public static void main(String[] args) {
	int num = 0;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("digite media");
		num = leia.nextInt();
		
		if(num>=9)
		{
			System.out.println("A");
		
		}
		else if (num>=7)
		{
			System.out.println("b");
		}
		else if (num>=5)
		{
			System.out.println("C");
		}
		else if (num<=5)
		{
			System.out.println("D");
		}


	}

}
