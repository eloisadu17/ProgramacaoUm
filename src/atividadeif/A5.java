package atividadeif;

import java.util.Scanner;

public class A5 {

	public static void main(String[] args) {
	int num = 0;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("digite uma idade");
		num = leia.nextInt();
		
		if(num>=60)
		{
			System.out.println("recebe desconto");
		
		}
	}

}
