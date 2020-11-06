package Lista1;

import java.util.Scanner;

public class ProgramacaoSequencial3 {
	public static void main(String[] args) {
		
		Scanner leia= new Scanner(System.in);
		int horas=0,minutos=0,segundos=0;
		
		System.out.printf("Tempo de duração:");
		int duracao= leia.nextInt();
		horas = (duracao/3600);
		minutos = (duracao%3600)/60;
		segundos = ((duracao%3600)%60 );
		System.out.printf("Tempo de duração: %d\nHoras: %d\nMinutos: %d\n Segundos: %d\n",duracao,horas,minutos,segundos);
		
	}

}
