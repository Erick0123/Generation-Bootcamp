programa
{
	
	funcao inicio()
	{
		 real base, altura, area
	 
	 escreva("Digite valor da base: ")
	 leia(base)
	 escreva("Digite valor da altura: ")
	 leia(altura)
	 
	 se(base>0 e altura>0)
	 {
		 area=((base*altura)/2)
		 escreva("O valor da Area de um triangulo é: ", area)
	 }
	 senao
	 {
		 escreva("Só calculamos valores positivos!!!")
	 }
	 
	
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 351; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */