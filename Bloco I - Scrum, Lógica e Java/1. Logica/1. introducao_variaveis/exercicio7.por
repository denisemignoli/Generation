programa
{
	inclua biblioteca Matematica-->mat
	
	funcao inicio()
	{
		real a,b,c,d,ee,f,x,y

		escreva("\nEntre com o valor de A: ")
		leia (a)
		escreva("\nEntre com o valor de B: ")
		leia (b)
		escreva("\nEntre com o valor de C: ")
		leia (c)
		escreva("\nEntre com o valor de D: ")
		leia (d)
		escreva("\nEntre com o valor de E: ")
		leia (ee)
		escreva("\nEntre com o valor de F: ")
		leia (f)

		x = (c*ee - b*f) / (a*ee - b*d)
		y = (a*f - c*a) / (a*ee - b*d)

		escreva("\nValor de X: ",mat.arredondar(x,3))
		escreva("\nValor de Y: ",mat.arredondar(y,3))
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 572; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */