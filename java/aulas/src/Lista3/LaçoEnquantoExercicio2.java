package Lista3;

import java.util.Scanner;

public class La�oEnquantoExercicio2 {
	public static void main(String[] args) {
		/*
		 *  Obtenha um n�mero digitado pelo usu�rio
		 *   e repita a opera��o de multiplicar ele por tr�s
		 *    (imprimindo o novo valor) at� que ele seja maior do que 100. Ex.: se o usu�rio digita 5,
		 *   deveremos observar na tela a seguinte sequ�ncia: 5 15 45 135.

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
