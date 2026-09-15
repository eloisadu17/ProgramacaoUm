package atividadeif;
import java.util.Scanner;
public class a1 {

	public static void main(String[] args) {
		
		int idade = 0;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("digite sua idade");
		idade = leia.nextInt();
		
		if(idade>=18)
		{
			System.out.println("vc e adulto");
		}
	}

}
