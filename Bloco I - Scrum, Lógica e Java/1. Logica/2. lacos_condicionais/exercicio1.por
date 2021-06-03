programa
{
	inclua biblioteca Matematica-->mat
	
	funcao inicio()
	{
		real peso, excesso, multa

		escreva("\nQual é mesmo o peso dos tomates de hoje? ")
		leia(peso)

		se (peso<=50.00)
		{
			escreva("\nPeso está dentro do estabelecido.")
		}

		senao se (peso>50.00)
		{
			excesso = (peso-50)
			multa = excesso*4
			escreva("\nVocê ultrapassou ", excesso, "kg do estabelecido, portanto pagar o valor de ", mat.arredondar(multa,2), "reais.")
		}
		senao
		{
			escreva("\nZERO.")
		}
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 134; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */