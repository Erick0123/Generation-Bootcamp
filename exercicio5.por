programa
{
	
	
	funcao inicio()
	{
		//Faça um sistema que leia as 3 notas de um aluno
		//e calcule a média final deste aluno. Considerar que
		//a média é ponderada e que o peso das notas é: 2,3 e 5, respectivamente. 

		//GRANDEZAS:
		//NOTAS PESO= 1,2 E 3
		//MEDIA=1+2+3/3
		//

		real n1,n2,n3
		real p1,p2,p3
		real resultadoNotas
		
		p1=2.0
		p2=3.0
		p3=5.0

		escreva("Nota 1= ")
		leia (n1)

		escreva("Nota 2= ")
		leia (n2)

		escreva("Nota 3= ")
		leia (n3)
		

		resultadoNotas=((n1*p1)+(n2*p2)+(n3*p3))
		

		escreva("Valor da Média= "+(resultadoNotas/12.0))
	

	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 583; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */