package Lista2;

import java.util.Scanner;

public class LaçoCondicionalExercicio1 {

	public static void main(String[] args) {
		
		Scanner read= new Scanner(System.in);
		
		double pesoTomate;
		double excesso;
		double multa;
		
		System.out.println("Digita o peso do Tomate em Kg: ");
		pesoTomate= read.nextDouble();

		excesso=(pesoTomate-50);
		multa=(excesso*4);
		
				if (pesoTomate>50 )
				{		
					System.out.printf("Seu kilo excedeu: "+excesso+"\nVocê vai ter uma multa de: "+multa);
				}
				else 
				 {
				 	System.out.println("Você não excedeu, sua multa é de 0 reais");
				 }
	}
}
