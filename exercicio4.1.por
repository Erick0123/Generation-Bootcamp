programa
{
	
	funcao inicio()
	{
		/*
		 * Exercícios com Vetores[  ] e Matrizes [  ][  ]
		Faça um programa que crie um vetor por leitura com 5 valores de pontuação de uma atividade
		e o escreva em seguida. Encontre
		após a maior pontuação e a apresente.

		 */
		inteiro valor[5], y=0//maiorValor
		
		para(inteiro x=0;x<5;x++)// gerenciando as linhas
		{
			escreva ("\ndigite um valor ", x+1,": ")
			leia (valor[x])// valor que devo por na linha
			se (valor[x]>y)// se o valor que eu coloquei na linha for maior que o meu valor maior
			{
				y=valor[x]// o meu maior valor(0) se torna o meu valor daquela linha e se so muda se tiver um numero maior que ele
			}
		
		}
			escreva("\nO maior valor: ", y)
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 711; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */