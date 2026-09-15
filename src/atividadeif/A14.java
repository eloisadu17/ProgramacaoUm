package atividadeif;

import java.util.Scanner;

public class A14 {

	public static void main(String[] args) {
		
		int num = 0;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("digite sua idade");
		num = leia.nextInt();
		
		if(num<=12)
		{
			System.out.println("infantil");
		
		}
		else if (num<=17)
		{
			System.out.println("juvenil");
		}
		else if (num<=39)
		{
			System.out.println("adulto");
		}
		else
		{
			System.out.println("master");
		}
	}

}
