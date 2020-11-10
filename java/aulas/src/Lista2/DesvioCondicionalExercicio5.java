package Lista2;

import java.util.Scanner;

public class DesvioCondicionalExercicio5 {
	
	public static void main(String[] args) {
	
		Scanner read= new Scanner(System.in);
		
		System.out.println(" indice de poluiçao dos grupos da Industria: ");
		double grupoIndustria= read.nextDouble();
		

		if ((grupoIndustria>=0.05) && (grupoIndustria<=0.25))
		{
			System.out.println("Indice de poluiçao aceitavel");
		}
		else if((grupoIndustria>=0.3) && (grupoIndustria<0.4))
		{
			System.out.println("as indústrias do 1º grupo são intimadas a suspenderem suas atividades");
		}
		else if((grupoIndustria>=0.4) && (grupoIndustria<0.5))
		{
			System.out.println("as industrias do 1º e 2º grupo são intimadas a suspenderem suas atividades");
		}
		else if (grupoIndustria>=0.5)
		{
			System.out.println("todos os grupos devem ser notificados a paralisarem suas atividades");
		}
		
	}

}
