package Lista2;

import java.util.Scanner;

public class DesvioCondicionalExercicio5 {
	
	public static void main(String[] args) {
	
		Scanner read= new Scanner(System.in);
		
		System.out.println(" indice de polui�ao dos grupos da Industria: ");
		double grupoIndustria= read.nextDouble();
		

		if ((grupoIndustria>=0.05) && (grupoIndustria<=0.25))
		{
			System.out.println("Indice de polui�ao aceitavel");
		}
		else if((grupoIndustria>=0.3) && (grupoIndustria<0.4))
		{
			System.out.println("as ind�strias do 1� grupo s�o intimadas a suspenderem suas atividades");
		}
		else if((grupoIndustria>=0.4) && (grupoIndustria<0.5))
		{
			System.out.println("as industrias do 1� e 2� grupo s�o intimadas a suspenderem suas atividades");
		}
		else if (grupoIndustria>=0.5)
		{
			System.out.println("todos os grupos devem ser notificados a paralisarem suas atividades");
		}
		
	}

}
