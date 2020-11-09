package Lista2;

import java.util.Scanner;

public class LaçoCondicionalExercicio7 {
public static void main(String[] args) {
	Scanner read= new Scanner(System.in);
	 double base, altura, area;
	 
	 System.out.println("Digite valor da base: ");
	 base=read.nextDouble();
	 System.out.println("Digite valor da altura: ");
	 altura=read.nextDouble();
	 
	 if(base>0 && altura>0)
	 {
		 area=((base*altura)/2);
		 System.out.printf("O valor da Area de um triangulo é: %.2f", area);
	 }
	 else 
	 {
		 System.out.println("Só calculamos valores positivos!!!");
	 }
	 
	}

}
