programa
{
	inclua biblioteca Matematica
	
	funcao inicio()
	{
		//O custo ao consumidor de um carro novo é a soma do custo de fábrica
		//com a percentagem do distribuidor e dos impostos (aplicados ao custo de fábrica). 
		//Supondo que a percentagem do distribuidor seja de 28% e os impostos de 45%, escrever um
		//sistema que leia o custo de fábrica de um carro e escreva o custo ao consumidor. 

		//GRANDEZAS:
		//O custo ao consumidor de um carro novo
		//custo de fábrica
		//percentagem do distribuidor=28%
		//percentagem doimpostos=45%

		real custoConsumidor
		real custoFabrica
		real percDistribuidor
		real percImpostos
		
		
		escreva("Custo da Fabrica (R$): ")
		leia (custoFabrica)

		percDistribuidor=custoFabrica* 0.28
		percImpostos=custoFabrica* 0.45
		custoConsumidor= (custoFabrica+percImpostos+percDistribuidor)
			
		escreva ("\nCusto do Consumidor = ",custoConsumidor )

		
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 895; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */