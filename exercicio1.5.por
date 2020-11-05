programa
{
	
	funcao inicio()
	{
		//objetivo:  Faça um sistema que leia o índice de poluição medido e emita a notificação adequada aos diferentes grupos de empresas.

		//variaveis
		real grupoIndustria
		
		//entradas
		escreva (" indice de poluiçao: ")
		leia (grupoIndustria)

		

		se ((grupoIndustria>=0.05) e (grupoIndustria<=0.25))
		{
			escreva("Indice de poluiçao aceitavel")
		}senao se((grupoIndustria>=0.3) e (grupoIndustria<0.4)){
			escreva("s")
		}senao se((grupoIndustria>=0.4) e (grupoIndustria<0.5)){
			escreva("r")
		}senao se(grupoIndustria>=0.5){
			escreva("t")
		}
	}
		
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 343; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */