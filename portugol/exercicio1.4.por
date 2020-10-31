programa
{
	
	funcao inicio()
	{
		/*
		 * Faça um sistema que leia um número inteiro e 
		 * mostre uma mensagem indicando se este número é 
		 * par ou ímpar, e se é positivo ou negativo.
		 */

		 inteiro n
		 //entradas//
		 escreva("escreva o numero + ou -: ")
		 leia(n)
		 //processamentos
		 se(n<0)
		 {
		 	escreva("\nNumero negativos, nao pode")
		 }
		 
		 senao se(n>0){
		 			se ((n%2)==0)
		 			escreva("\nO numero digitado é par e positivo")
		 	senao
		 	{
		 		escreva("numero digitado é impar positivo")
		 	}
		 }
		 //saidas
		 senao
		 {
		 escreva(" zero é considerado neutro")
		 }
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 296; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */