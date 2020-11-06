programa
{
	
	funcao inicio()
	{		
		/*
		 * Escrever um programa que leia uma quantidade desconhecida 
		 * de números e conte quantos deles estão nos seguintes intervalos: 
		 * [0-25], [26-50], [51-75] e [76-100]. A entrada de dados deve terminar quando for lido um número negativo.
		 * 
		 * Pelo oq entendi é só para o programa ler o número que vc digitou. 
		 * Exemplo: Digitei 19 aí o programa vai entender que ele se enquadra no [0-25].
		 */
		inteiro contador=0
		inteiro numero 

		 escreva("Digite um numero: ")
		 leia(numero)

		se (numero>=0 e numero<=25)
		{
			contador++
			escreva("O ",numero, " se enquadra entre 0 à 25 ")
		}
		  
		se (numero>=26 e numero<=50)
		{
			contador++
			escreva("O ",numero, " se enquadra entre 26 à 50")
		}
		se (numero>=51 e numero<=75)
		{
			contador++
			escreva("O ",numero, " se enquadra entre 51 à 75")
		}
		se (numero>=76 e numero<=100)
		{
			contador++
			escreva("O ",numero, " se enquadra entre 76 à 100")
		}
	}
	
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 809; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */