package Lista4;

import java.util.Scanner;

public class VetorExercicio1 {
	public static void main(String[] args) {
		Scanner leia=new Scanner(System.in);
		/*
		 *   Faça um programa que crie um vetor por leitura com 5
		 *    valores de pontuação de uma atividade e o escreva em seguida.
		 *     Encontre após a maior pontuação e a apresente.
		 */
			int valor[] = new int[5];
			int valorMaximo=0;
			System.out.println("digite 5 numeros");
			for(int x=0;x<5;x++)
			{
				System.out.print("Numero "+(x+1)+": ");
				valor[x]=leia.nextInt();
			
			if(valor[x]>valorMaximo)
				{
					valorMaximo=valor[x];
				}
			}
			System.out.println("valor maximo: "+valorMaximo);
	}

}
