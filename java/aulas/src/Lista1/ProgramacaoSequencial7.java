package Lista1;

import java.util.Scanner;

public class ProgramacaoSequencial7 {
	public static void main(String[] args) {
		Scanner leia= new Scanner(System.in);
		System.out.println("Escreva ");
		double a=leia.nextDouble();
		double b=leia.nextDouble();
		double c=leia.nextDouble();
		double d=leia.nextDouble();
		double e=leia.nextDouble();
		double f=leia.nextDouble();
		
		double x= ((c*e-b*f)/(a*e-b*d));
		double y=((a*f-c*d)/(a*e-b*d));
		
		 c=((a*x)+(b*y));
		 f=((d*x)+(e*y));
		 System.out.printf("O valor de x é %2f\nO valor de y é %2f",x,y);
	}

}
