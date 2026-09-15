package atividadeif;

import java.util.Scanner;

public class A13 {

	public static void main(String[] args) {
		int num = 0;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("digite sua nota de 0 a 100");
		num = leia.nextInt();
		
		
		if(num>=90) { System.out.println("exelente"); } 
		else if (num>=70) { System.out.println("bom"); }
		else if (num>=50) { System.out.println("regular"); } 
		else if (num>50) { System.out.println("insuficiente"); }
	}

}
