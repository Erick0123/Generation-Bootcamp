package Exemplo;

import java.util.Scanner;

public class triangulo {
	 public static void main(String[] args) {
		Scanner leia=new Scanner(System.in);
		
		int base, base2,altura,altura2, area, area2;
		
		
		System.out.println("digite valor base: ");
		base=leia.nextInt();
		while(base<0)
		{
			
		}
		System.out.println("digite valor altura: ");
		altura=leia.nextInt();
		
		
		
		if(base<=0 || altura<=0)
		{
			System.out.println("valores invalidos");
		}
		else
		{
			area= (base*altura)/2;
		System.out.println("valor da area: "+area);
		}
		
		
		System.out.print("\ndigite valor base2");
		base2=leia.nextInt();
		System.out.print("\ndigite valor altura2");
		altura2=leia.nextInt();
		
		if(base<=0 || altura<=0)
		{
			System.out.println("valores invalidos");
		}
		else
		{
			area2= (base2*altura2)/2;
			System.out.println("valor da area2: "+area2);
		}
		
		if(area)
		{
			
		}
		
			
		
		
	
	 }
}
