programa
{
	
	funcao inicio()
	{
/*/Enunciado:
 1- Elaborar um programa que efetue a leitura sucessiva de valores numéricos e apresente no final o total do somatório, 
 a média e o total de valores lidos. O programa deve fazer as leituras dos valores enquanto o usuário estiver fornecendo 
 valores positivos. Ou seja, o programa deve parar quando o usuário fornecer um valor negativo.
 */
		inteiro valor, somaValor=0, contValor=0, mediaValor

		escreva("\nEntre com um valor: ")
		leia(valor)

		enquanto(valor>=0) //enquanto digitar valores positivos ele vai aceitar, ou seja, se digitar negativo ele sai
		{
			somaValor = somaValor + valor
			contValor++ //contValor++ = contaValor + 1
			escreva("\nEntre com um valor: ") //colocamos isso pra deixar finito, pra sair
			leia(valor)
		}

		se(contValor==0)
		{
			escreva("\nNão é possível fazer divisão por zero!")
		}
		senao
		{
		mediaValor = somaValor / contValor

		escreva("\nSomatório dos valores: ", somaValor)
		escreva("\nQuantidade de valores: ", contValor)
		escreva("\nMédia dos valores: ", mediaValor)
		}
 	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 792; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */