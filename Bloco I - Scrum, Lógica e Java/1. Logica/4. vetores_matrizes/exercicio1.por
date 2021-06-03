programa
{
	
	funcao inicio()
	{
	/*Enunciado:
	 * Faça um programa que crie um vetor por leitura com 5 valores de pontuação de uma atividade e o escreva em seguida. 
	 * Encontre após a maior pontuação e a apresente. 
	 */
	 
		real valores[5], maiorP=0.0
		inteiro x

		para(x=0;x<5;x++)
		{
			escreva("\nEntre com um valor da atividade: ")
			leia(valores[x])

			se (maiorP < valores[x])
			maiorP = valores [x]
		}

		para(x=0;x<5;x++)
		{
			escreva("\nValores das atividades [",(x+1),"] = ",valores[x])
		}

		escreva("\nA maior pontuação é: ", maiorP)
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