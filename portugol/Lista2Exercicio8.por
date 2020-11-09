programa
{
	
	funcao inicio()
	{
		inteiro N=0;
		escreva("Digite um numero maior que 100, caso ao contrario esse valor será zerado: ")
		leia(N)
		
		se(N>100)
		{
			escreva("Seu valor é de: "+N)
			
		}
		senao se (N<100)
		{
			N=N-N;
			escreva("Seu valor foi zerado: "+N)
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 281; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */