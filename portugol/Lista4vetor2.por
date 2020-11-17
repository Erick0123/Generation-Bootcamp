
		programa
{
	inclua biblioteca Util
    funcao inicio()
	{
		 /*
		  *  Um dado é lançado 10 vezes e o valor correspondente é anotado. 
		  *  Faça um programa que gere um vetor com os lançamentos, escreva esse vetor. 
		  *  A seguir determine e imprima a média aritmética dos lançamentos, contabilize 
		  *  e apresente também quantas foram as ocorrências da maior pontuação.
		  */
		  const inteiro NUMERO=10
		  inteiro lancador [NUMERO]
		  inteiro somaLancamento=0
		  inteiro maiorPontuacao=0
		  inteiro contador=0

		  para(inteiro x=0;x<NUMERO;x++)
		  {
		  	lancador[x]= Util.sorteia(1, 9)
		  	escreva("\nValor Correspondente ",x+1,": ", lancador[x])
		  	somaLancamento= somaLancamento + lancador[x]
		  	se (lancador[x]>=maiorPontuacao)
		  	{
		  		se (lancador[x]!=maiorPontuacao)
		  		{
		  			contador=0
		  		}
		  		maiorPontuacao=lancador[x]
		  		contador++
		  	}
		  }
		 escreva("\nSoma dos Lançamentos: ", somaLancamento)
		 escreva("\nMedia Aritmetica: ",somaLancamento/NUMERO)
		 escreva("\nMaior pontuçao: ", maiorPontuacao)
		 escreva("\nQuantidade de Repetiçao: ", contador)	
	}
}	
	
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1112; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */