package Lista2;

import java.util.Scanner;

public class La�oCondicionalExercicio4 {
	public static void main(String[] args) {
		
		Scanner read= new Scanner(System.in);

		
		 
		 System.out.println("escreva o numero + ou -: ");
		 int n = read.nextInt() ;
		 
		 if(n<0)
		 {
		 	System.out.println("\nNumero negativos, nao pode");
		 }
		 
		 else if(n>0)
		 {
			if ((n%2)==0) 
			{
		 			System.out.println("\nO numero digitado � par e positivo");
			}
				else 		
		 	{
		 		System.out.println("numero digitado � impar positivo");
		 	}
		 }
		 else
		 {
		 System.out.println(" zero � considerado neutro");
		 }
		
	}

}
