package Lista2;

import java.util.Scanner;

public class La�oCondicionalExercicio1 {

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
					System.out.printf("Seu kilo excedeu: "+excesso+"\nVoc� vai ter uma multa de: "+multa);
				}
				else 
				 {
				 	System.out.println("Voc� n�o excedeu, sua multa � de 0 reais");
				 }
	}
}
