
import java.util.Scanner;
public class calculo {
	public static void main(String[]args) {
		System.out.println("Escreva os graus em celcius");
				Scanner leia = new Scanner(System.in);
				double divisao = 1.8;
				int celcius;
				celcius = leia.nextInt();
				
				double farenheit;
				farenheit = (double) ((celcius * 1.8) + 32);
				System.out.println("Essa temperatura convertida para farenheit � de: "+farenheit);
				leia.close();
		}
	}
	