package Lista1;
import java.util.Scanner;

public class ProgramacaoSequencial2 {
	public static void main(String[] args) {
		/*
		 * 2. Faça um sistema que leia a idade de uma pessoa expressa em dias
		 *  e mostre-a expressa em anos, meses e dias. 

		 */
		System.out.println("Digite o dia: ");
		Scanner leia = new Scanner(System.in);
	
		int idade=0;
		int anos=0;
		int meses=0;
		int dia=0;
		
		idade= leia.nextInt();
		anos=idade/365;
		meses=idade/12;
		dia=idade;
		System.out.printf("Sua conta de Vida: \ndias= %d \nanos= %d\nmeses=%d " ,dia,anos,meses);
		leia.close();
	}

}
