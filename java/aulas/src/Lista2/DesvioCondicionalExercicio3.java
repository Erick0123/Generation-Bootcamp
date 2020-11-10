package Lista2;

import java.util.Scanner;

public class DesvioCondicionalExercicio3 {
	public static void main(String[] args) {
		
		Scanner read= new Scanner(System.in);
		double a,b,c,d,ra,rb,rc,rd;
		

		System.out.println("Digite 4 valores: ");
		a= read.nextDouble();
		b= read.nextDouble();
		c= read.nextDouble();
		d= read.nextDouble();
		
		ra= Math.pow(a, 2);
		rb= Math.pow(b, 2);
		rc= Math.pow(c, 2);
		rd= Math.pow(d, 2);
		
		if (rc>=1000)
		{
			System.out.println("Valor resultante do quadrado do terceiro: "+rc);
		}
		else
		{
			System.out.println("Valor resultante do numero 1: "+ra);
			System.out.println("\nValor resultante do numero 2: "+rb);
			System.out.println("\nValor resultante do numero 3: "+rc);
			System.out.println("\nValor resultante do numero 4: "+rd);
		}
		
	}

}
