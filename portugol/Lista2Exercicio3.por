programa
{
	
	funcao inicio()
	{
		//variaveis
		real a,b,c,d,ra,rb,rc,rd
		

		escreva("valor de numero 1: ")
		leia (a)
		
		escreva("valor de numero 2: ")
		leia (b)		
		
		escreva("valor de numero 3: ")
		leia (c)		
		
		escreva("valor de numero 4: ")
		leia (d)		
		
		ra=a*a
		rb=b*b
		rc=c*c
		rd=d*d

		limpa()
		
		se (rc>=1000)
		{
			escreva("Valor resultante do quadrado do terceiro: ",rc)
		}

		senao
		{
			escreva("Valor resultante do numero 1: ",ra)
			escreva("\nValor resultante do numero 2: ",rb)
			escreva("\nValor resultante do numero 3: ",rc)
			escreva("\nValor resultante do numero 4: ",rd)
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 625; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */