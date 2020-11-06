programa
{
	inclua biblioteca Util
	
	funcao inicio()
	{
		/*
		 * Faça um programa que lê um vetor de 3 elementos e 
		 * uma matriz de 3 x 3 elementos. 
		 * Em seguida o programa deve 
		 * fazer a multiplicação do vetor pelas colunas da matriz.
		 */
		 inteiro soma=0
		 inteiro vetor[3]
		 inteiro matriz[3][3]
		 inteiro linha=0, coluna=0
		

		 escreva ("vetor\n")
		 para(linha=0;linha<3;linha++)
		 {
		 	{	
		 		
		 		vetor[linha]=Util.sorteia(1,9)
		 		escreva(vetor[linha])
		 		escreva(" ")
		 	}
					escreva("\n") 
		
		  escreva ("Matriz\n")
		 para(linha=0;linha<3;linha++)
		 {
		 	para(coluna=0;coluna<3;coluna++)
		 	{	
		 		
		 		matriz[linha][coluna]=Util.sorteia(1,9)
		 		escreva(matriz[linha][coluna])
		 		escreva(" ")
		 	}
					escreva("\n") 
		 }
		  escreva ("Multiplicador\n")
		para(linha=0;linha<3;linha++)
		 {
		 	para(coluna=0;coluna<3;coluna++)
		 	{	
		 		soma=vetor[coluna]*matriz[linha][coluna]
		 		escreva(soma)
		 		escreva(" ")
		 	}
		 	escreva("\n")
		 }
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 345; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */