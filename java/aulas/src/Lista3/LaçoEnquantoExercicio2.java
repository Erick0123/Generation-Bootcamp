package Lista3;

import java.util.Scanner;

public class LaçoEnquantoExercicio2 {
	public static void main(String[] args) {
		/*
		 *  Obtenha um número digitado pelo usuário
		 *   e repita a operação de multiplicar ele por três
		 *    (imprimindo o novo valor) até que ele seja maior do que 100. Ex.: se o usuário digita 5,
		 *   deveremos observar na tela a seguinte sequência: 5 15 45 135.

		 */
		Scanner leia= new Scanner(System.in); 
		int numero=0;
		int mult=0;
		System.out.println("Digite um Numero positivo: ");
		numero=leia.nextInt();
		mult=numero;
		System.out.println("numero obtidos: "+mult+("\n"));
		
		while(numero<=100)
		{
			numero=numero*3;
			System.out.println("numero obtidos: "+numero+("\n"));	
		}	
		
		
	}
}
