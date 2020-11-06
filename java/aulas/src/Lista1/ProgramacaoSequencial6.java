package Lista1;

import java.util.Scanner;

public class ProgramacaoSequencial6 {
	public static void main(String[] args) {
		Scanner leia= new Scanner(System.in);
		
		System.out.println("Escreva quatro numeros: ");
		double x1= leia.nextDouble();
		double x2= leia.nextDouble();
		double y1= leia.nextDouble();
		double y2= leia.nextDouble();
		
		double d= Math. sqrt(Math.pow(x2-x1, 2)+Math.pow(y2-y1, 2));
		System.out.println("Valor do Calculo: "+d);
	}

}
