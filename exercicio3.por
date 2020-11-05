programa
{
	
	funcao inicio()
	{
		
		
		//  Faça um sistema que leia o tempo de duração 
		//de um evento em uma fábrica expressa em segundos e
		//mostre-o expresso em horas, minutos e segundos. 

		//GRANDEZAS
		
		//SEGUNDOS:1S
		//HORAS:3600S
		//MINUTOS:60S

		inteiro valorSegundos
		
		inteiro horas
		inteiro minutos,segundos
		
		
		//entrada
		escreva("Tempo de Duração: ")
		leia(valorSegundos)

		//processamentos
		horas = (valorSegundos/3600)
		minutos = (valorSegundos%3600)/60
		segundos = ((valorSegundos%3600)%60 )
		

		escreva("\nHoras: ",+horas)
		escreva("\nMinutos: ",+minutos)
		escreva("\nSegundos: ",+segundos)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 642; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */