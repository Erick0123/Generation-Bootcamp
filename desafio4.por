programa
{
	inclua biblioteca Matematica-->mat
	/*
	 * 	Faça um programa que calcula e escreve a seguinte soma: soma 
	 * 	= 1/1 + 3/2 + 5/3 + 7/4 + ... + 99/50
	 */
	funcao inicio()
	{
		
		real soma=0.0,normal=0.0,impar=0.0
	
		para(impar=0.0;impar<99.0;impar++){	
			
			normal=normal++
			impar=impar++
			soma=impar/normal
			escreva(impar," / ",normal,"  =  ",mat.arredondar(soma,2),"\n")	
		}		
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 409; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */