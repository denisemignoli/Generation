programa
{
	
	funcao inicio()
	{
		inteiro horas, minutos, segundos, totalSegundos

		escreva("\nEntre com o total de segundos do evento: ")
		leia(totalSegundos)

		horas = totalSegundos / 3600
		// porque 1 hora tem 3600 segundos
		minutos = (totalSegundos % 3600) / 60
		//totalSegundos = 5000
		// % pega o resto da divisão, portanto, de acordo com o exemplo pega 1400/60
		segundos = (totalSegundos % 3600) % 60

		escreva("\nHoras: ", horas, "\nMinutos: ", minutos, "\nSegundos: ", segundos)

		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 513; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */