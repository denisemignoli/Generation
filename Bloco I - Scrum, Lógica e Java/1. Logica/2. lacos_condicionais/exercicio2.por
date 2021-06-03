programa
{
	
	funcao inicio()
	{
		real codigo, numero, salarioTotal=0.0, salarioExcedente

		escreva("\nInforme aqui o total de horas trabalhadas: ")
		leia(numero)

		se (numero<=50)
		{
			salarioTotal = numero*10
			escreva("\nSeu salário total é: ", salarioTotal)
		}

		senao se (numero>50)
			salarioTotal = numero*10
			salarioExcedente = (numero - 50)*20
			escreva("\nSeu salário total é: ",salarioTotal, "\nSeu salário excedente é: ", salarioExcedente)

	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 476; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */