import java.util.Scanner;

public class Exercicio7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int x;
		
		x = sc.nextInt();
		
		if(x < 0) {
			System.out.println("NEGATIVO");
		} else if (x >= 0) {
			System.out.println("NÃO NEGATIVO");
		}
		
		sc.close();
	}
}
