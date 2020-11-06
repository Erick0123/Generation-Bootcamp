programa
{
	
	funcao inicio()
	{
		//DADOS:
		//INTEIROS POSITIVOS: A,B,C
		//R é (A+B)^2 equaçao
		//S é (B+C)^2 equaçao
		//D é R+S/2 sera o resultado

		//PROCESSAMENTOS
		inteiro A
		inteiro B
		inteiro C
		
		inteiro	R
		inteiro 	S
		inteiro 	D

		escreva("Valor de A= ")
		leia (A)
		
		escreva("\nValor de B= ")
		leia (B)
		
		escreva("\nValor de C= ")
		leia (C)

		R= ((A+B)*(A+B))
		S=((B+C)*(B+C))
		D= ((R+S)/2)
		
		escreva("\nValor de R= "+R)
		escreva("\nValor de S= "+S)
		escreva("\nValor de D= "+D)
	
		
	
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 529; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */