package Lista2;

import java.util.Scanner;

public class La�oCondicionalExercicio6 {
	public static void main(String[] args) {
		Scanner read= new Scanner (System.in);
		
		int idade;
		
		System.out.println("Digite sua idade: ");
		idade=read.nextInt();
		
		if(idade>=5 && idade<=7)
		{
			System.out.println("Classifica�ao Infantil A");
		}

			else if(idade>=8 && idade<=11)
		{
			System.out.println("Classifica�ao Infantil B");
		}

			else if(idade>=12 && idade<=13)
		{
			System.out.println("Classifica�ao Juvenil A");
		}

			else if(idade>=14 && idade<=17)
		{
			System.out.println("Classifica�ao Juvenil B");
		}

			else if(idade>=18)
		{
			System.out.println("Classifica�ao Adultos");
		}
		else
		{
			System.out.println("Classifica��o Indisponivel");
		}
		
	}
}
