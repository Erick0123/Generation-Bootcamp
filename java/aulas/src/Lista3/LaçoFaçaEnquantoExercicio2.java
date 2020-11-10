package Lista3;

import java.util.Scanner;

public class LaçoFaçaEnquantoExercicio2 {
	public static void main(String[] args) {
		Scanner leia= new Scanner (System.in);
		int numero,soma=0, contador=0;

				System.out.print("Digite um número: ");
				numero=leia.nextInt();
				
				do
				{
					
					soma = soma + numero ;
					numero = numero-1;
				}
				while(numero>0 );
				{
				
				System.out.println(soma);
				}
	
	}

}
