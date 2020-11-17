package ListaPOO;

import java.util.Scanner;

import Entidades.Cliente;

public class ExercicioCliente {
	public static void main(String[] args) {
		Scanner leia= new Scanner(System.in);
		Cliente cliente=new Cliente();
		
		System.out.println("Ola! qual o seu nome:");
		cliente.nome=leia.next().toUpperCase().charAt(0);
		
		
	}

}
