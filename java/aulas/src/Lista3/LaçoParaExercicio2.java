package Lista3;

public class La�oParaExercicio2 {
	public static void main(String[] args) {
		/*
		 *  Desenvolver um sistema que efetue a 
		 *  soma de todos os n�meros �mpares que 
		 *  s�o  m�ltiplos de tr�s e que se encontram 
		 *  no conjunto dos n�meros de 1 at� 500.
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
				System.out.printf("numeros de 1 � 500 impares da tabela 3 de multiplica�ao : %d\n Soma dos numeros de 1 � 500 impares da tabela 3 de multiplica�ao : %d\n\n",numerosImpares, soma);
			}	
		}	
	}
}
