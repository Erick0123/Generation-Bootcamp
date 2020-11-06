programa
{
	
	funcao inicio()
	{
		/*
		 * Elabore um sistema que leia as variáveis C e N, respectivamente 
		 * código e número de horas trabalhadas de um operário. E calcule o salário 
		 * sabendo-se que ele ganha R$ 10,00 por hora. Quando o número de horas exceder 
		 * a 50 calcule o excesso de pagamento armazenando-o na variável E, caso contrário zerar 
		 * tal variável. A hora excedente de trabalho vale R$ 20,00. No final do processamento 
		 * imprimir o salário total e o salário excedente.
		 */
		 
		// hTrabalhadas=número de horas trabalhadas de um operário
		// hExtra
		// hSalario= calcule o salário sabendo-se que ele ganha R$ 10,00 por hora
		// totalSalario
		//excesso= Quando o número de horas exceder a 50 calcule o excesso de pagamento
		
		//variaveis
		real horas
		real hTrabalhada
		real excesso
		real exHora
		real totalSalario
          escreva("Quantas horas ele trabalho: ")
          leia(hTrabalhada)
          horas =(hTrabalhada*10)
          excesso =(hTrabalhada - 50)
          exHora = (excesso*20)
          totalSalario = (500 + exHora)
          se (hTrabalhada <=50)
          {
          	escreva(" O operador  trabalhou ",hTrabalhada,"horas\n",  "Ele Recebeu R$",horas," porque não excedeu o limite de horas.")
         	
          }
          senao
          {
          	escreva("O operador trabalhou ",hTrabalhada, " horas, e excedeu ",excesso," recebendo o valor de R$",totalSalario," de salario.")
          }         	
	}

}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1479; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */