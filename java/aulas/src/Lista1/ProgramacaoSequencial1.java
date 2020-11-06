package Lista1;

import java.util.Scanner;

public class ProgramacaoSequencial1 {
	
	public static void main(String[] args) {
		
	/*
	 *  Faça um sistema que leia a idade de uma pessoa expressa
	 *   em anos, meses e dias e mostre-a expressa apenas em dias. 
	 */
	
		System.out.println("Escreva sua idade: ");
		Scanner leia = new Scanner(System.in);
		
		int idade=0;
		int meses=30;
		int dias=1;
		int anos=365;
		idade=leia.nextInt();
		anos=idade;
		meses=idade*12;
		dias=idade*365;
		System.out.printf("Sua conta de Vida: \nanos= %d\nmeses=%d \ndias=%d ",anos,meses,dias);
		leia.close();
		
	}
	

}
