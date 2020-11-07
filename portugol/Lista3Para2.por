programa
{
	inclua biblioteca Util
	
	
	funcao inicio()
	{
		/* Desenvolver um sistema que efetue a soma de todos 
		 * os números ímpares que são  múltiplos de três e que se
		 encontram no conjunto dos números de 1 até 500.
		 */
		//variaveis
		inteiro x
		inteiro soma=0
		const inteiro RAPIDEZ=500

		
		escreva("Os valores impares é de 1 ate 5 e sao multiplos de 3")

		para (x=1;x<=500;x++)
		{
		se (x%2==1) 
		{	
				limpa()
			escreva("\nNumero impar: ",x)
			soma=x*3
			escreva("\nSoma dos valores é de ",soma,"\n")
			Util.aguarde(RAPIDEZ)
			
		}
		
			
			
		}
		
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 586; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */