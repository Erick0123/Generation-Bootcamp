programa
{
	inclua biblioteca Matematica--> mat
	
	
	funcao inicio()
	{
		// Toda vez que ele traz
		//um peso de tomate maior que o estabelecido pelo regulamento do estado
		//de São Paulo (50 quilos) deve pagar um multa de R$ 4,00 por quilo excedente.
		//João precisa que você faça um sistema que leia a variável P (peso de tomates)
		//e verifique se há excesso. Se houver, gravar na variável E (Excesso) e na variável
		//M o valor da multa que João deverá pagar. Caso contrário mostrar tais variáveis com o conteúdo ZERO.

		//condiçao:
		//tomate maior que o estabelecido pelo regulamento do estado
		//de São Paulo (50 quilos) deve pagar um multa de R$ 4,00
		
		//variaeis
		real pesoTomate
		real excesso
		real multa
		

		//entrada
		escreva("Digita o peso do Tomate em Kg: ")
		leia(pesoTomate)

		excesso=(pesoTomate-50)
		multa=(excesso*4)

		//processamentos
		se (pesoTomate>50 )
		{		
			escreva("Seu kilo excedeu: ",excesso, "\nVocê vai ter uma multa de: ",multa)
		}
		 senao
		 {
		 	escreva("Você não excedeu, sua multa é de 0 reais")
		 }
	
		
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1054; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */