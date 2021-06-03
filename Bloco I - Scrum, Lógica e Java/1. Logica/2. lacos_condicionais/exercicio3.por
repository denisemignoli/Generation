programa
{
	inclua biblioteca Matematica-->mat
	
	funcao inicio()
	{
		real n1, n2, n3, n4, x1, x2, x3, x4

		escreva("\nInforme o primeiro número ")
		leia(n1)

		escreva("\nInforme o segundo número ")
		leia(n2)

		escreva("\nInforme o terceiro número ")
		leia(n3)

		escreva("\nInforme o quarto número ")
		leia(n4)

		x1 = mat.potencia(n1,2.0)
		x2 = mat.potencia(n2,2.0)
		x3 = mat.potencia(n3,2.0)
		x4 = mat.potencia(n4,2.0)

		se (x3>=1000)
		{
			escreva("\nO quadrado do terceiro número é: ", x3)
		}

		senao
		{
			escreva("\nOs números: ", n1,"-", n2,"-", n3,"-", n4, ",possuem os quadrados ", x1,"-", x2,"-", x3,"-", x4, ", respectivamente")
		}
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 511; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */