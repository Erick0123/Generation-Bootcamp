package Lista2;

import java.util.Scanner;

public class DesvioCondicionalExercicio8 {
	public static void main(String[] args) {
		Scanner read=new Scanner(System.in);
		
		int N=0;
		System.out.println("Digite um numero maior que 100, caso ao contrario esse valor ser� zerado: ");
		N=read.nextInt();
		
		if(N>100)
		{
			System.out.println("Seu valor � de "+N);
			
		}
		else if (N<100)
		{
			N=N-N;
			System.out.println("Seu valor foi zerado: "+N);
		}
		
	}
}
