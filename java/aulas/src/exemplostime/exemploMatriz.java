package exemplostime;

import java.util.Scanner;

public class exemploMatriz {
	public static void main(String[] args) {
		
		Scanner leia=new Scanner(System.in);
		
		int dia;
		String tarefa[][]=new String[5][31];
		
		System.out.println("Digite dia: ");
		dia=leia.nextInt();
		
		for(int x=0;x<5;x++)
		{
			System.out.println("digite sua tarefa "+(x+1)+":");
			leia.nextLine();
			tarefa[x][dia-1]=leia.nextLine();
		}
		
		
	

	}
}

