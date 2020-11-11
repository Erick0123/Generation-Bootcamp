package Lista3;

public class LaçoParaExercicio2 {
	public static void main(String[] args) {
		/*
		 *  Desenvolver um sistema que efetue a 
		 *  soma de todos os números ímpares que 
		 *  são  múltiplos de três e que se encontram 
		 *  no conjunto dos números de 1 até 500.
		 */
		int numerosImpares=0;
		int x=0;
		int soma=0;
		
		for(x=1;x<500;x++)
		{	
			if(((x%1)==0)&& ((x%2)==1) && numerosImpares<500)
			{
				numerosImpares=x*3;
				soma= soma+numerosImpares;
				System.out.printf("numeros de 1 à 500 impares da tabela 3 de multiplicaçao : %d\n Soma dos numeros de 1 à 500 impares da tabela 3 de multiplicaçao : %d\n\n",numerosImpares, soma);
			}	
		}	
	}
}
