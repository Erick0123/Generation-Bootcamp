package Lista1;

import java.util.Scanner;


public class ProgramacaoSequencial4 {
	public static void main(String[] args) {
		Scanner leia= new Scanner(System.in);
		double D=0,R=0,S=0;
	
		System.out.println("Escreva três numeros: ");
		int A=leia.nextInt();
		int B=leia.nextInt();
		int C=leia.nextInt();
		
		R=Math.pow(A+B, 2);
		S=Math.pow(B+C, 2);
		D=(R+S)/2;
		System.out.println("Valor de R= "+R);
		System.out.println("Valor de S= "+S);
		System.out.println("Valor de D= "+D);
	}

}
