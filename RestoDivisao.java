
import java.util.Scanner;
public class RestoDivisao {
	public static void main(String[]args) {;
		Scanner scan  = new Scanner (System.in);
		System.out.println ("escreva um numero: ");
		int a = scan.nextInt ();
		if(( a % 2) == 0) {
			System.out.println("é par");
	}
		else {
			System.out.println("é impar");
		}
}
}
