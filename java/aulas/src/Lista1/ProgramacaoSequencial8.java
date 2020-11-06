package Lista1;

import java.util.Scanner;

public class ProgramacaoSequencial8 {
	public static void main(String[] args) {
		Scanner leia= new Scanner(System.in);
		
		System.out.println("Valor do carro: ");
		double valorCarro=leia.nextDouble();
		
		double valorConsumidor= valorCarro+(valorCarro*0.73);/* o valorCarro é usado duas vezes pq ele entra na fabrica e no 
																consumidor 0.73 é a porcentagem de imposto + consumidor
																*/
		System.out.println("Valor do custo do consumidor é de "+valorConsumidor+" 100Reais");
	}

}
