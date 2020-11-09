programa
{
	
	funcao inicio()
	{
		//objetivo:  Faça um sistema que leia o índice de poluição medido e emita a notificação adequada aos diferentes grupos de empresas.

		//variaveis
		real grupoIndustria
		
		//entradas
		escreva (" indice de poluiçao dos 3 grupos da industria: ")
		leia (grupoIndustria)

		

		se ((grupoIndustria>=0.05) e (grupoIndustria<=0.25))
		{
			escreva("Indice de poluiçao aceitavel")
		}senao se((grupoIndustria>=0.3) e (grupoIndustria<0.4)){
			escreva(" as indústrias do 1º grupo são intimadas a suspenderem suas atividades")
		}
		senao se((grupoIndustria>=0.4) e (grupoIndustria<0.5)){
			escreva("as industrias do 1º e 2º grupo são intimadas a suspenderem suas atividades")
		}senao se(grupoIndustria>=0.5){
			escreva("todos os grupos devem ser notificados a paralisarem suas atividades")
		}
	}
		
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 705; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */