programa
{
	
	funcao inicio()
	{
		inteiro anos, meses, dias, totalDias

		escreva("\nEntre com a quantidade de anos: ")
		leia(anos)
		escreva("\nEntre com a quantidade de meses: ")
		leia(meses)
		escreva("\nEntre com a quantidade de dias: ")
		leia(dias)

		totalDias=anos*365 + meses*30 + dias

		escreva("\nTotal de dias vividos: ", totalDias)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 353; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */