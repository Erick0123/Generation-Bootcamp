package Lista1;

import java.util.Scanner;

public class ProgramacaoSequencial5 {
	public static void main(String[] args) {
	Scanner leia= new Scanner(System.in);
	double p1,p2,p3;
	double resultadoNotas;
	p1=2.0;
	p2=3.0;
	p3=5.0;
	System.out.println("Escreva três notas do seu Boletim: ");
	double n1=leia.nextDouble();
	double n2=leia.nextDouble();
	double n3=leia.nextDouble();
	
	resultadoNotas=((n1*p1)+(n2*p2)+(n3*p3));
	System.out.println("Valor da Média= "+(resultadoNotas/12));
	}

}
