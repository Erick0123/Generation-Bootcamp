programa
{
	
	funcao inicio()
	{
		/*
		 * 	Faça um programa que leia um vetor de 5 posições 
		 * 	para números reais e, depois, um código inteiro. 
		 * 	Se o código for zero, finalize o programa; 
		 * 	se for 1, mostre o vetor na ordem direta; 
		 * 	se for 2, mostre o 	vetor na ordem inversa. 
		 * 	Caso, o código for diferente de 1 e 2, 
		 * 	escreva uma mensagem informando que o código inválido.

		 */
		 real numero[5]
		 inteiro x=0
		 inteiro codigo
		 
		para(x=0;x<5;x++)
		{
			escreva("Digite Numero: ")
			leia(numero[x])
		}
			escreva("Digite o codigo 0, 1 ou 2: ")
			leia(codigo)

		se(codigo==0)
		{
			escreva("Programa finalizado")
		}
		senao se(codigo==1)
		{
			para(x=0;x<5;x++)
			{
				escreva(numero[x],"\n")
			}
		}
		senao se(codigo==2)
		{
			para(x=4;x>=0;x--)
			{
				escreva(numero[x],"\n")
			}
			
		}
		senao
		{
			escreva("Opção invalida.")
		}
		
		
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 905; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */