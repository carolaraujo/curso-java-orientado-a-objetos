import java.util.Scanner;

public class Exercicio10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int horaIni, horaFim;
		horaIni = sc.nextInt();
		horaFim = sc.nextInt();
		
		int duracao;
		if(horaIni < horaFim) {
			duracao = horaFim - horaIni;
		}
		else {
			duracao = 24 - horaIni - horaFim;
			
			System.out.println("O JOGO DUROU " + duracao + " HORA(S)");
			
			sc.close();
		}
	}
	
}
