programa
{
	
	funcao inicio()
	{
	/*Enunciado:
 	* Crie um programa que receba valores do usuário para preencher uma matriz 3X3, e em seguida, exiba a soma dos valores dela 
 	* e a soma dos valores da primeira diagonal, ou seja, diagonal principal.
 	*/
		real valores[3][3], soma_valores=0.0, soma_diagonal=0.0
		inteiro l, c
		// l =linha	c=coluna

		para(l=0;l<3;l++)
		{
			para(c=0;c<3;c++)
			{
				escreva("\nEntre com o valor: ")
				leia(valores[l][c])

				soma_valores = soma_valores + valores[l][c]

				se(l==c) //linha==coluna, se for iguais, quer dizer que ali tem a diagonal principal
				{
					soma_diagonal = soma_diagonal + valores[l][c]
				}
			}
		}			
		escreva ("\nA soma de todos os valores é de :", soma_valores)
		escreva("\nA soma dos valores da primeira diagonal é igual a: ", soma_diagonal)
       }
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 669; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = {valores, 10, 7, 7}-{soma_valores, 10, 22, 12}-{soma_diagonal, 10, 40, 13};
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */