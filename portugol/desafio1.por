programa
{
	
	funcao inicio()
	{ 
  	/*
	Elabore um programa que calcule o que deve ser pago por um produto,
	considerando o preço normal de etiqueta e a escolha da condição de pagamento.
	Utilize os códigos da tabela a seguir para ler qual a condição de pagamento escolhida e efetuar o cálculo adequado.
	Código Condição de pagamento
1 À vista em dinheiro ou cheque, recebe 20% de desconto
2 À vista no cartão de crédito, recebe 15% de desconto
3 Em duas vezes, preço normal de etiqueta sem juros
4 Em três vezes, preço normal de etiqueta mais juros de 10%

	*/
	real preco=0.0
	inteiro pagamento=0
	real avista, cartao1, cartao2, cartao3

	escreva("Preço do Produto: ")
	leia(preco)
	
	avista=(preco*0.2)
	cartao1=(preco*0.15)
	cartao2=(preco/2)
	cartao3=((preco/3)*0.1)
	

	escreva("Valor à vista: ", avista)
	escreva("\nValor à vista no cartão: ", cartao1)
	escreva("\nValor parcelado em 2x: ", cartao2)
	escreva("\nValor parcelado em 3x: ", cartao3)

	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 960; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */