programa
{
	inclua biblioteca Matematica-->mat
	
	funcao inicio()
	{
		real base, altura, area

		escreva("\nEntre com a base do triângulo: ")
		leia(base)

		escreva("\nEntre com a altura do triângulo: ")
		leia(altura)


		se(base>0 e altura>0)
		{
			area = (base * altura)/2
			escreva("\nÁrea do triângulo foi de: ",mat.arredondar (area,2))
		}
		senao
		{
			escreva("\nEstes valores não formam um triângulo...")	
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 420; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */